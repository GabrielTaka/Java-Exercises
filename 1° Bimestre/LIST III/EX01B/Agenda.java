package EX01B;

import java.util.Scanner;
import java.util.Vector;

public class Agenda {
	private Vector <Pessoa> pessoas;
	private Scanner scanner;
	
	public Agenda() {
		pessoas = new Vector<Pessoa>();
		scanner = new Scanner(System.in);
	}
	
	public void cadastrarPessoa() {
		System.out.println("\nInsira o nome de uma pessoa: ");
		String nome = scanner.next();
		System.out.println("\nInsira o telefone de uma pessoa: ");
		int telefone = scanner.nextInt();
		System.out.println("\nInsira o email de uma pessoa: ");
		String email = scanner.next();
		Pessoa nova = new Pessoa(nome, email, telefone);
		pessoas.add(nova);
		System.out.println("Novo contato adicionado!\n");
		
	}
	
	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções.\n");
		System.out.println("1 - Listar contatos \n");
		System.out.println("2 - Incluir contatos \n");
		System.out.println("3 - Ecluir contatos \n");
		System.out.println("4 - Sair \n");
		
	}
	
	public void imprimirPessoas() {
		for(Pessoa pessoa:pessoas){
			if(pessoa != null) {
				System.out.println("\nNome: "+ pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nE-mail: " + pessoa.getEmail());
			}
		}
	}
	
	public void excluirPessoas() {
		int excluir = 0;
		System.out.println("Escolha a posição do contato que será excluida: ");
		excluir = scanner.nextInt();
		
		pessoas.remove(excluir - 1);
		
	}
	
}
