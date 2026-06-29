package sistema_de_usuarios_01;

public class TestaUsuarios {

public static void main(String[] args) {
		
		usuarioValido();
		administradorValido();
		nomeVazio();
		emailInvalido();
	
	}
	
		static void usuarioValido() {
			
				System.out.println("\nUsuário Valido");
				
				
				try {
					Usuario u1 = new Usuario("Joel", "joel@generation.org");
					u1.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
			}
			
			static void administradorValido() {
				
				System.out.println("\nAdministrador Valido");
				
				
				try {
					Administrador adm = new Administrador("Larissa", "larissa@gmail.com", "1");
					adm.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
			}
			
			static void nomeVazio() {
				
				System.out.println("\n O Nome não pode ser vazio");
				
				
				try {
					Administrador adm = new Administrador("", "larissa@gmail.com", "1");
					adm.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
				
			}
			
			static void emailInvalido() {
				
				System.out.println("\nO email digitado é inválido");
				
				// Se alterar para vazio o campo email ele exibe a mensagem de email vazio, se digitar errado ele exibe a mensagem para digitar um email valido
				try {
					Administrador adm = new Administrador("Zeus", "zeus.com", "1");
					adm.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
					
					
		  }
				
	  }
 }

