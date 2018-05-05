package EX06;
import java.util.Scanner;

public class Inicio {
	
	
	public static void main(String [] args) {
		Agenda agendar = new Agenda();
		Scanner scanner = new Scanner(System.in);
		
		int sair = 0;
		int opcao = 0;
		
		while(sair == 0) {
			switch (opcao) {
			case 0:
				agendar.funcionalidades();
				opcao = scanner.nextInt();
				break;
			
			case 1: 
				agendar.cadastrarPessoa();
				opcao = 0;
				break;
				
			case 2: 
				agendar.montanteMensal();
				opcao = 0;
				break;
				
			case 3:
				agendar.gastoMensal();
				opcao = 0;
				break;
				
			case 4:
				agendar.gastoTotal();
				opcao = 0;
				break;
				
			case 5:
				agendar.excluirCliente();
				opcao = 0;
				break;
				
			case 6:
				agendar.alterarDados();
				opcao = 0;
				break;
			
			default:
				agendar.funcionalidades();
				
				opcao = scanner.nextInt();
				break;
			}
		}
		
	}
}
