package EX02;

public class Produto {
	
	
	private int quantidade;
	private double total;
	
	
	public Produto(int quantidade, double total) {
		
		this.quantidade = quantidade;
		this.total = total;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
