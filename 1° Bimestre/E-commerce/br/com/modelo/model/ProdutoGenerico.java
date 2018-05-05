package br.com.modelo.model;

public class ProdutoGenerico extends Produto{
	private String especificacoes;
	private int index;	
	
	
	
	public ProdutoGenerico(int totalVendido, int index) {
		super(totalVendido);
		this.index = index;
		// TODO Auto-generated constructor stub
	}
	
	public ProdutoGenerico(String nomeProduto, int estoque, double preco, int index) {
		super(nomeProduto,estoque, preco);
		this.setIndex(index);
		// TODO Auto-generated constructor stub
	}

	public ProdutoGenerico(String nomeProduto, int estoque, double preco, int index, String especificacoes) {
		super(nomeProduto,estoque, preco);
		this.setIndex(index);
		this.setEspecificacoes(especificacoes);
		// TODO Auto-generated constructor stub
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
