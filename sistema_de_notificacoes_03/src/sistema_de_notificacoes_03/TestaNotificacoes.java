package sistema_de_notificacoes_03;

public class TestaNotificacoes {

    public static void main(String[] args) {
        emailValido();
        smsValido();
        mensagemVazia();
        destinatarioVazio();
        tipoInexistente();
    }

    static void criarNotificacao(String tipo, String destinatario, String mensagem) {
        Validacao.validarMensagem(mensagem);

        Notificacao notificacao;

        if (tipo.equalsIgnoreCase("Email")) {
            notificacao = new NotificacaoEmail(destinatario);
        } else if (tipo.equalsIgnoreCase("SMS")) {
            notificacao = new NotificacaoSMS(destinatario);
        } else {
            throw new IllegalArgumentException("Tipo inválido! Use apenas Email ou SMS.");
        }

        notificacao.enviar(mensagem);
    }

    static void emailValido() {
        System.out.println("\nEmail válido");
        try {
            criarNotificacao("Email", "joel@email.com", "Bem-vindo ao sistema");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void smsValido() {
        System.out.println("\nSMS válido");
        try {
            criarNotificacao("SMS", "11911112222", "Seu código é 4567");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void mensagemVazia() {
        System.out.println("\nMensagem vazia");
        try {
            criarNotificacao("Email", "joel@email.com", "");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void destinatarioVazio() {
        System.out.println("\nDestinatário vazio");
        try {
            criarNotificacao("SMS", "", "Mensagem de teste");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void tipoInexistente() {
        System.out.println("\nTipo inexistente");
        try {
            criarNotificacao("Push", "joel@email.com", "Mensagem teste");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}