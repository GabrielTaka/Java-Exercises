package EX06;

import java.util.Scanner;
import java.util.ArrayList;


public class Agenda {
	private Scanner scanner;
	private ArrayList<Cliente> pessoas;

	public Agenda() {
		scanner = new Scanner(System.in);
		pessoas = new ArrayList<Cliente>();
	}
	
	public void cadastrarPessoa() {
		System.out.println("Insira o nome do cliente: ");
		String nome = scanner.next();
		System.out.println("Insira o email do cliente: ");
		String email = scanner.next();
		System.out.println("Insira o telefone do cliente: ");
		int telefone = scanner.nextInt();
		System.out.println("Insira o endereço do cliente: ");
		String endereco = scanner.next();
		System.out.println("Insira o dinheiro gasto do clinete no mes de Janeiro: ");
		double mesJaneiro = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Fevereiro: ");
		double mesFevereiro = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Março: ");
		double mesMarco = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Abril: ");
		double mesAbril = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Maio: ");
		double mesMaio = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Junho: ");
		double mesJunho = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Julho: ");
		double mesJulho = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Agosto: ");
		double mesAgosto = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Setembro: ");
		double mesSetembro = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Outubro: ");
		double mesOutubro = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Novembro: ");
		double mesNovembro = scanner.nextDouble();
		
		System.out.println("Insira o dinheiro gasto do clinete no mes de Dezembro: ");
		double mesDezembro = scanner.nextDouble();
		Cliente pessoa = new Cliente(nome, email, telefone, endereco, mesJaneiro, mesFevereiro, mesMarco, mesAbril, mesMaio, mesJunho, mesJulho, mesAgosto, mesSetembro, mesOutubro, mesNovembro, mesDezembro);
		pessoas.add(pessoa);
		System.out.println("Novo contato adicionado.");
	}
	
	
	public void funcionalidades() {
		System.out.println("<1> Cadastrar clientes.");
		System.out.println("<2> Montante mensal. ");
		System.out.println("<3> Cliente com maior gasto mensal.");
		System.out.println("<4> Cliente com maior gasto total.");
		System.out.println("<5> Deletar cliente.");
		System.out.println("<6>  Alterar dados do cliente.");
	}
	
	
	
	public void montanteMensal() {
		double totalJaneiro = 0;
		double totalFevereiro = 0;
		double totalMarco = 0;
		double totalAbril = 0;
		double totalMaio = 0;
		double totalJunho = 0;
		double totalJulho = 0;
		double totalAgosto = 0;
		double totalSetembro = 0;
		double totalOutubro = 0;
		double totalNovembro = 0;
		double totalDezembro = 0;
		double total;
		
		for (Cliente pessoa : pessoas) {
			
			totalJaneiro = totalJaneiro + pessoa.getMesJaneiro();
			totalFevereiro = totalFevereiro + pessoa.getMesFevereiro();
			totalMarco = totalMarco + pessoa.getMesMarco();
			totalAbril = totalAbril + pessoa.getMesAbril();
			totalMaio = totalMaio + pessoa.getMesMaio();
			totalJunho = totalJunho + pessoa.getMesJunho();
			totalJulho = totalJulho + pessoa.getMesJulho();
			totalAgosto = totalAgosto + pessoa.getMesAgosto();
			totalSetembro = totalSetembro + pessoa.getMesSetembro();
			totalOutubro = totalOutubro + pessoa.getMesOutubro();
			totalNovembro = totalNovembro + pessoa.getMesNovembro();
			totalDezembro = totalDezembro + pessoa.getMesDezembro();
			
			
		}	
		total = totalJaneiro + totalFevereiro + totalMarco + totalAbril + totalMaio + totalJunho + totalJulho + totalAgosto + totalSetembro + totalOutubro + totalNovembro + totalDezembro;
		
		
		System.out.println("Montante total Janeiro: " + totalJaneiro);
		System.out.println("Montante total Fevereiro: " + totalFevereiro);
		System.out.println("Montante total Março: " + totalMarco);
		System.out.println("Montante total Abril: " + totalAbril);
		System.out.println("Montante total Maio: " + totalMaio);
		System.out.println("Montante total Junho: " + totalJunho);
		System.out.println("Montante total Julho: " + totalJulho);
		System.out.println("Montante total Agosto: " + totalAgosto);
		System.out.println("Montante total Outubro: " + totalOutubro);
		System.out.println("Montante total Setembro: " + totalSetembro);
		System.out.println("Montante total Novembro: " + totalNovembro);
		System.out.println("Montante total Dezembro: " + totalDezembro);
		System.out.println("Total geral: " + total);
		System.out.println("\n \n");
		
		
	}
	
	
	public void gastoMensal() {
		
		double auxJaneiro = pessoas.get(0).getMesJaneiro();
		double auxFevereiro = pessoas.get(0).getMesFevereiro();
		double auxMarco = pessoas.get(0).getMesMarco();
		double auxAbril = pessoas.get(0).getMesAbril();
		double auxMaio = pessoas.get(0).getMesMaio();
		double auxJunho = pessoas.get(0).getMesJunho();
		double auxJulho = pessoas.get(0).getMesJulho();
		double auxAgosto = pessoas.get(0).getMesAgosto();
		double auxSetembro = pessoas.get(0).getMesSetembro();
		double auxOutubro = pessoas.get(0).getMesOutubro();
		double auxNovembro = pessoas.get(0).getMesNovembro();
		double auxDezembro = pessoas.get(0).getMesDezembro();
		
		
		for (Cliente pessoa : pessoas) {
			if(auxJaneiro < pessoa.getMesJaneiro()) {
				auxJaneiro = pessoa.getMesJaneiro();
			}
				
			if(auxFevereiro < pessoa.getMesFevereiro()) {
				auxFevereiro = pessoa.getMesFevereiro();
			}
			
			if(auxMarco < pessoa.getMesMarco()) {
				auxMarco = pessoa.getMesMarco();
			}
			
			if(auxAbril < pessoa.getMesAbril()) {
				auxAbril = pessoa.getMesAbril();
			}
			
			if(auxMaio < pessoa.getMesMaio()) {
				auxMaio = pessoa.getMesMaio();
			}
			
			if(auxJunho < pessoa.getMesJunho()) {
				auxJunho = pessoa.getMesJunho();
			}
			
			if(auxJulho < pessoa.getMesJulho()) {
				auxJulho = pessoa.getMesJulho();
			}
			
			
			if(auxAgosto < pessoa.getMesAgosto()) {
				auxAgosto = pessoa.getMesAgosto();
			}
			
			if(auxSetembro < pessoa.getMesSetembro()) {
				auxSetembro = pessoa.getMesSetembro();
			}
			
			
			if(auxOutubro < pessoa.getMesOutubro()) {
				auxOutubro = pessoa.getMesOutubro();
			}
			
			
			if(auxNovembro < pessoa.getMesNovembro()) {
				auxNovembro = pessoa.getMesNovembro();
			}
			
			
			if(auxDezembro < pessoa.getMesDezembro()) {
				auxDezembro = pessoa.getMesDezembro();
			}
		}
		
		for (Cliente cliente : pessoas) {
			if (auxJaneiro == cliente.getMesJaneiro()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesJaneiro());

			}
			
			if (auxFevereiro == cliente.getMesFevereiro()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesJaneiro());

			}
			
			if (auxMarco == cliente.getMesMarco()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesMarco());

			}
			if (auxAbril == cliente.getMesAbril()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesAbril());

			}
			if (auxMaio == cliente.getMesMaio()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesMaio());

			}
			if (auxJunho == cliente.getMesJunho()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesJunho());

			}
			if (auxJulho == cliente.getMesJulho()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesJulho());

			}
			if (auxAgosto == cliente.getMesAgosto()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesAgosto());

			}
			if (auxSetembro == cliente.getMesSetembro()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesSetembro());

			}
			if (auxOutubro == cliente.getMesOutubro()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesOutubro());

			}
			if (auxNovembro == cliente.getMesNovembro()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesNovembro());

			}
			if (auxDezembro == cliente.getMesDezembro()) {
				System.out.println("Cliente que mais gastou em Janeiro \n");
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Quantia :" + cliente.getMesDezembro());

			}
			
		}
	}
	
	public void gastoTotal() {
		double aux = pessoas.get(0).getMesFevereiro() +  pessoas.get(0).getMesJaneiro() +   pessoas.get(0).getMesMarco() + pessoas.get(0).getMesAbril() +  pessoas.get(0).getMesMaio() +  pessoas.get(0).getMesJunho() +  pessoas.get(0).getMesJulho() +  pessoas.get(0).getMesAgosto() +  pessoas.get(0).getMesSetembro() +  pessoas.get(0).getMesOutubro() +  pessoas.get(0).getMesNovembro() +  pessoas.get(0).getMesDezembro();
		String auxNome = pessoas.get(0).getNome();
		
		for (Cliente cliente : pessoas) {
			
			double totalCliente1 = cliente.getMesFevereiro() +  cliente.getMesJaneiro() +  cliente.getMesMarco() + cliente.getMesAbril() + cliente.getMesMaio() + cliente.getMesJunho() + cliente.getMesJulho() + cliente.getMesAgosto() + cliente.getMesSetembro() + cliente.getMesOutubro() + cliente.getMesNovembro() + cliente.getMesDezembro();
				
			if(aux < totalCliente1) {
				aux = totalCliente1;
				auxNome = cliente.getNome();
			}
				
	
	}
		System.out.println("\n Cliente com maior gasto!");
		System.out.println("Nome: "+  auxNome);
		System.out.println("Montante gasto: " + aux);
	}
	
	public void excluirCliente() {
		String nome;
		
		System.out.println("Insira o nome do cliente a ser excluido: ");
		nome = scanner.next();
		
		for(Cliente cliente: pessoas) {
			if(cliente.getNome().equals(nome)) {
				pessoas.remove(cliente);
				System.out.println("\n Cliente deletado com o sucesso!");
			}
		}
		
	}
	
	public void alterarDados() {
		String nome;
		
		System.out.println("Insira o nome do cliente que terá os dados alterados: ");
		
		nome = scanner.next();
		
		for(Cliente cliente: pessoas) {
			if(cliente.getNome().equals(nome)) {
				System.out.println("Insira o novo número de telefone: ");
				int numero = scanner.nextInt();
				System.out.println("Insira o novo endereço: ");
				String endereco = scanner.next();
				
				Cliente pessoa = new Cliente (numero, endereco);
			}
		}
	}
}
