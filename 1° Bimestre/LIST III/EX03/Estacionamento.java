package EX03;

public class Estacionamento {
	private double tempo;
	private double total;
	
	public Estacionamento(double tempo, double total) {
		this.tempo = tempo;
		this.total = total;
	}
	
	public double getTempo() {
		return tempo;
	}
	
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
}
