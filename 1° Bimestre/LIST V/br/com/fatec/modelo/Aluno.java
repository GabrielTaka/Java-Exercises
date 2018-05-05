package br.com.fatec.modelo;

public class Aluno extends Pessoa {

	private String numeroDaMatricula;

	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();

		dadosFormatados = dadosFormatados + "\nNúmero da matricula: " + this.getNumeroDaMatricula();
		return dadosFormatados;
	}

	public String getNumeroDaMatricula() {
		return numeroDaMatricula;
	}

	public void setNumeroDaMatricula(String numeroDaMatricula) {
		this.numeroDaMatricula = numeroDaMatricula;
	}

	public Aluno(String nome, String telefone, String email, String numeroDaMatricula) {
		super(nome, telefone, email);
		this.numeroDaMatricula = numeroDaMatricula;
	}

	public Aluno() {

	}

}
