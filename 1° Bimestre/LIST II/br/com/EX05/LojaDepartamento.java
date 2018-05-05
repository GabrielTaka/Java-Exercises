package br.com.EX05;
import br.com.EX05.Cliente;

public class LojaDepartamento {
	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		Cliente clienteDados = new Cliente();
			
		
			System.out.printf("Insira o número da conta: ");
			clienteDados.numeroConta = leitura.nextInt();
			System.out.printf("Insira o saldo inicial da conta: ");
			clienteDados.saldoInicial = leitura.nextDouble();
			System.out.printf("Insira suas despesas totais: ");
			clienteDados.despesas = leitura.nextDouble();
			System.out.printf("Insira os créditos aplicados: ");
			clienteDados.creditoAplicado = leitura.nextDouble();
			
			clienteDados.novoSaldo = (clienteDados.saldoInicial + clienteDados.despesas) - clienteDados.creditoAplicado;
			
			System.out.printf("\n Novo Saldo:R$ %.2f", clienteDados.novoSaldo);
			
			if(clienteDados.novoSaldo < 0 ) {
				System.out.printf("O saldo foi excedido!");
			}
			else {
				System.out.printf("\n O saldo foi excedido!");
			}
			
	}
}
