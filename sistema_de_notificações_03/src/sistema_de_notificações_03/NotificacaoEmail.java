package sistema_de_notificacoes_03;

public class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String email) {
        super(email);
    }

    @Override
    public void enviar(String mensagem) {
        Validacao.validarMensagem(mensagem);
        System.out.println("Enviando Email para " + getDestinatario() + " - Mensagem: " + mensagem);
    }
}