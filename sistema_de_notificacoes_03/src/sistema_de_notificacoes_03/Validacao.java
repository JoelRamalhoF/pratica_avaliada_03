package sistema_de_notificacoes_03;

public class Validacao {

    public static void validarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("A mensagem não pode ser nula ou vazia!");
        }
    }

    public static void validarDestinatario(String destinatario) {
        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("O destinatário não pode ser nulo ou vazio!");
        }

        String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String regexTelefone = "^\\d{11}$";

        if (!destinatario.matches(regexEmail) && !destinatario.matches(regexTelefone)) {
            throw new IllegalArgumentException("Destinatário inválido! Digite um e-mail ou celular válido com DDD.");
        }
    }
}