package sistema_de_veiculos_02;

public class Carro {
    private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        setModelo(modelo);
        setVelocidade(velocidade);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo do carro não pode ser vazio!");
        }
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void visualizar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void acelerar(int valor) {
        Validacao.validarAceleracao(valor);
        setVelocidade(getVelocidade() + valor);
    }
}