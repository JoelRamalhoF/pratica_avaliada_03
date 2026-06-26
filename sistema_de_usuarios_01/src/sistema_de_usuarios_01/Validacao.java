package sistema_de_usuarios_01;

public class Validacao {
	
	public static void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
    }

    public static void validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("O Email não pode ser vazio.");
        }

        String emailsValidos = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (!email.matches(emailsValidos)) {
            throw new IllegalArgumentException("Digite um Email válido!");
        }
    }
}


