package EX03;
import java.util.Scanner;
import java.lang.Math;

public class CalculaCarro {
	private Scanner scanner;
	
	public  CalculaCarro(){
		scanner = new Scanner(System.in);
	}
	
	
	public void inicio() {
		System.out.println("Insira o tempo em minutos que o carro ficou guardado: ");
		double tempo = scanner.nextInt();
		
		if(tempo <= 180) {
			double total = 2.00;
			Estacionamento estacionar = new Estacionamento(tempo,total);
			
			System.out.println("Valor total: R$ " + estacionar.getTotal());
			
		}
		else {
			double total = (tempo - 180) / 60;
			
			total = Math.ceil(total);
			
			total = total * 0.50 + 2.00;
			Estacionamento estacionar = new Estacionamento(tempo,total);
			
			System.out.println("Valor total: R$ " + estacionar.getTotal());
		}
	}
}
