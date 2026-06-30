package sistema_de_notificacoes_03;

public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String telefone) {
        super(telefone);
    }

    @Override
    public void enviar(String mensagem) {
        Validacao.validarMensagem(mensagem);
        System.out.println("Enviando SMS para " + getDestinatario() + " - Mensagem: " + mensagem);
    }
}