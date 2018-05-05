package EX02;
import java.util.Scanner;


public class Aplicacao {
	public static void main(String args[]) {
		Scanner scanner  = new Scanner(System.in);
		Calcular calculo = new Calcular();
		
		int sair = 0;
		int opcao = 0;
		
		while(sair == 0) {
			switch (opcao) {
			case 0:{
				calculo.menu();
				opcao = scanner.nextInt();
				break;
			}
			
			case 111:{
				calculo.produtoP1();
				opcao = 0;
				break;
			}
			
			case 222:{
				calculo.produtoP2();
				opcao = 0;
				break;
			}
			case 333:{
				calculo.produtoP3();
				opcao = 0;
				break;
			}
			case 444:{
				calculo.produtoP4();
				opcao = 0;
				break;
			}
			
			case 555:{
				calculo.produtoP5();
				opcao = 0;
				break;
			}
			
			default:
				calculo.menu();
				opcao = scanner.nextInt();
				break;
			}
		}
	}
}
