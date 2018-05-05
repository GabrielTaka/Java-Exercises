package br.com.EX06;
import br.com.EX06.Vendedor;

public class Inicio {
	
	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);	
			
		Vendedor funcionario = new Vendedor();
			
		System.out.printf("Valor total de vendas: ");
		funcionario.itensVendidos = leitura.nextDouble();
		
		funcionario.rendimento = funcionario.itensVendidos * funcionario.porcentBruto + funcionario.saldoFixo;
		
		System.out.printf("Rendimento final:R$ %.2f", funcionario.rendimento);
	}
}
