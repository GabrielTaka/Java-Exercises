package br.com.fatec.modelo;

public abstract class Pessoa implements Contato {

	private String nome;
	private String telefone;
	private String email;

	@Override
	public String dadosFormatados() {
		String dadosFormatados;

		dadosFormatados = "\nNome: " + this.getNome();
		dadosFormatados = dadosFormatados  + "\nTelefone: " + this.getTelefone();
		dadosFormatados = dadosFormatados + "\nEmail: " + this.getEmail();

		return dadosFormatados;
	}

	@Override
	public final String inicio() {

		String menu = "\n<1> Cadastrar Alunos" + "\n<2> Cadastrar Professor" + "\n<3> Listar alunos" + "\n<4> Listar professores"
				+ "\n<5> Editar alunos" + "\n<6> Editar professor" + "\n<7> Salvar dados" + "\n<8> Carregar dados"
				+"\n<9> Excluir alunos ou professores" + "\n<10> Sair" ;
		
		return menu;
	}

	public Pessoa(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
