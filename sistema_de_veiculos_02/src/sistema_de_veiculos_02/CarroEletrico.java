package sistema_de_veiculos_02;

public class CarroEletrico extends Carro {

    private int nivelBateria;
    private static final int CONSUMO_POR_ACELERACAO = 2;

    public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
        super(modelo, velocidade);
        setNivelBateria(nivelBateria);
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        Validacao.validarNivelBateria(nivelBateria);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Bateria restante: " + nivelBateria + "%");
    }

    @Override
    public void acelerar(int valor) {
        Validacao.validarAceleracao(valor);

        int consumo = valor * CONSUMO_POR_ACELERACAO;

        Validacao.validarBateriaInsuficiente(nivelBateria, consumo);

        nivelBateria = nivelBateria - consumo;
        setVelocidade(getVelocidade() + valor);
    }
}