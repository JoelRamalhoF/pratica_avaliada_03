package sistema_de_veiculos_02;

public class Validacao {

    public static void validarAceleracao(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("A aceleração deve ser maior que zero!");
        }
    }

    public static void validarNivelBateria(int nivelBateria) {
        if (nivelBateria < 0 || nivelBateria > 100) {
            throw new IllegalArgumentException("O nível da bateria deve estar entre 0 e 100!");
        }
    }

    public static void validarBateriaInsuficiente(int nivelBateria, int consumo) {
        if (consumo > nivelBateria) {
            throw new IllegalArgumentException("Bateria insuficiente para essa aceleração!");
        }
    }
}