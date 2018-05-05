package EX01A;

import java.util.Scanner;

public class Aplicacao {
	private static Scanner scanner;
	
	public static void main(String args[]) {
		scanner  = new Scanner(System.in);
		
		Agenda agendar = new Agenda();
		
		int sair = 0;
		int opcao = 0;
		
		
		while(sair == 0) {
			switch (opcao) {
			case 0:{
				agendar.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
				
			case 1:{
				agendar.imprimirPessoas();
				opcao = 0;
				break;
			}
			
			case 2:{
				agendar.CadastrarPessoa();
				opcao = 0;
				break;
			}
			
			case 3:{
				
				
				agendar.excluirPessoa();
				opcao = 0;
				break;
			}
			
			case 4:{
				sair = 1;
				System.out.println("Até mais!");
				break;
			}

			default:
				agendar.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}
	}
	
	
	
}
