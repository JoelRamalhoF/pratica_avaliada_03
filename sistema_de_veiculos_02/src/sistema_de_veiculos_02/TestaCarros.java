package sistema_de_veiculos_02;

public class TestaCarros {

    public static void main(String[] args) {
        testeCarroEletricoValido();
        testeAceleracaoInvalida();
        testeBateriaInsuficiente();
        testeBateriaNegativa();
        testeBateriaAcimaDe100();
    }

    static void criarCarroEletrico(String modelo, int velocidade, int bateria, int aceleracao) {
        CarroEletrico carro = new CarroEletrico(modelo, velocidade, bateria);
        carro.acelerar(aceleracao);
        carro.visualizar();
    }

    static void testeCarroEletricoValido() {
        System.out.println("\nCarro Elétrico valido");
        try {
            criarCarroEletrico("Tesla Model 3", 0, 65, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void testeAceleracaoInvalida() {
        System.out.println("\nAceleração Inválida");
        try {
            criarCarroEletrico("Tesla", 50, 80, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void testeBateriaInsuficiente() {
        System.out.println("\nBateria Insuficiente");
        try {
            criarCarroEletrico("Tesla", 0, 20, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void testeBateriaNegativa() {
        System.out.println("\nBateria Negativa");
        try {
            criarCarroEletrico("Tesla", 50, -1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void testeBateriaAcimaDe100() {
        System.out.println("\nA Bateria está acima de 100%");
        try {
            criarCarroEletrico("Tesla", 50, 101, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}