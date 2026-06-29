package sistema_de_usuarios_01;

public class Administrador extends Usuario {
		
		private String nivelAcesso;

		public Administrador(String nome, String email, String nivelAcesso) {
			super(nome, email);
			this.nivelAcesso = nivelAcesso;
		}

		public String getNivelAcesso() {
			return nivelAcesso;
		}

		public void setNivelAcesso(String nivelAcesso) {
			this.nivelAcesso = nivelAcesso;
		}
		
		 @Override
		    public void visualizar() {
		        System.out.println("Nome: " + getNome() +
		                           " | Email: " + getEmail() +
		                           " | Nível de Acesso: " + this.nivelAcesso);
		    }
	}


