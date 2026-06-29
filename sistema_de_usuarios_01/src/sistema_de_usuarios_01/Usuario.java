package sistema_de_usuarios_01;

public class Usuario {
	private String nome;
	private String email;

	public Usuario(String nome, String email) {

		Validacao.validarNome(nome);
		Validacao.validarEmail(email);

		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Validacao.validarNome(nome);
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Validacao.validarEmail(email);
		this.email = email;
	}

	public String descricao() {
		return "Nome: " + this.nome + " | Email: " + this.email;

	}

	public void visualizar() {
		System.out.println(descricao());
	}

}
