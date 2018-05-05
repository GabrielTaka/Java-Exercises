package EX01B;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
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
				agendar.cadastrarPessoa();
				opcao = 0;
				break;
			}
			
			case 3:{
				agendar.excluirPessoas();
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

