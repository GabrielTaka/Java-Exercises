package br.com.modelo.model;

public abstract class  Produto implements modeloContrato {
	private String nomeProduto;
	private int estoque;
	private double preco;
	private int totalVendido;
	
	
	public Produto(int totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	
	public Produto(String nomeProduto, int estoque, double preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public String dadosFormatados() {
		String dados = "\nNome do produto: " + this.getNomeProduto() + "\nPreço R$: " + this.getValorProduto() + "\nQuantidade em estoque: " + this.getEstoque();
		return dados;
		
	}
	
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getValorProduto() {
		return preco;
	}
	public void setValorProduto(int valorProduto) {
		this.preco = valorProduto;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(int totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	
	
	
}
