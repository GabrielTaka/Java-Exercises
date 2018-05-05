package EX01A;

import java.util.Scanner;

public class Agenda {

	private Pessoa [] pessoas;
	private Scanner scanner;
	
	public Agenda() {
		pessoas = new Pessoa [5];
		scanner = new Scanner(System.in);
		
	}

	public void CadastrarPessoa() {
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i] == null) {
				System.out.println("Insira o nome de uma pessoa: ");
				String nome = scanner.next();
				System.out.println("Insira o telefone de uma pessoa: ");
				int telefone = scanner.nextInt();
				System.out.println("Insira o email de uma pessoa: ");
				String email = scanner.next();
				
				Pessoa nova = new Pessoa(nome,email,telefone);
				pessoas[i] = nova;
				break;
				
			}
		}
	}
	
	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções.\n");
		System.out.println("1 - Listar contatos \n");
		System.out.println("2 - Incluir contatos \n");
		System.out.println("3 - Ecluir contatos \n");
		System.out.println("4 - Sair \n");
		
		
	}
	
	public void imprimirPessoas() {
		for(Pessoa pessoa:pessoas) {
			if(pessoa != null) {
				System.out.println("\nNome: " + pessoa.getNome() + "\n Telefone: " + pessoa.getTelefone() + "\n Email: " + pessoa.getEmail() );
			}
		}
	}
	
    public Pessoa[] getPessoas(){
    	return pessoas;
    }
    
    
    public void setPessoas(Pessoa[] pessoas) {
    	this.pessoas = pessoas;
    }
    
    public void excluirPessoa() {
    	int excluir = 0;
    	System.out.println("Escolha a posição do contato que será excluido.");
    	excluir = scanner.nextInt();
    	
    	pessoas[excluir - 1] = null;
    	
    }
}
