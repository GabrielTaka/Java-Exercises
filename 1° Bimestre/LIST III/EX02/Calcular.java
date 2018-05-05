package EX02;
import java.util.Scanner;


public class Calcular {
	
	private Scanner scanner;

	public Calcular(){
		scanner = new Scanner(System.in);
	}
	
	
	public void menu() {
		System.out.println("\n Produtos. \n");
		System.out.println("\nP1 - ID: 111");
		System.out.println("\nP2 - ID: 222");
		System.out.println("\nP3 - ID: 333");
		System.out.println("\nP4 - ID: 444");
		System.out.println("\nP5 - ID: 555");
		System.out.println("\nInsira o ID do produto a ser calculado.");
		System.out.println("-----------------------------------------");
	}
	
	public void produtoP1() {
		System.out.println("Insira a quantidade de produtos ");
		int quantidade = scanner.nextInt();
		double valor = 1.00;
		
		double total = (valor * quantidade);
		
		Produto produto = new Produto(quantidade, total);
		
		System.out.println("\n Valor total:R$ " + produto.getTotal());
		
	}
	
	public void produtoP2() {
		System.out.println("Insira a quantidade de produtos ");
		int quantidade = scanner.nextInt();
		double valor = 2.98;
		
		double total = (valor * quantidade);
		
		Produto produto = new Produto(quantidade, total);
		
		System.out.println("\nValor total:R$ " + produto.getTotal());
		
	}
	
	public void produtoP3() {
		System.out.println("Insira a quantidade de produtos ");
		int quantidade = scanner.nextInt();
		double valor = 9.98;
		
		double total = (valor * quantidade);
		
		Produto produto = new Produto(quantidade, total);
		
		System.out.println("\nValor total:R$ " + produto.getTotal());
		
	}
	
	public void produtoP4() {
		System.out.println("Insira a quantidade de produtos ");
		int quantidade = scanner.nextInt();
		double valor = 4.49;
		
		double total = (valor * quantidade);
		
		Produto produto = new Produto(quantidade, total);
		
		System.out.println("\nValor total:R$ " + produto.getTotal());
		
	}
	
	public void produtoP5() {
		System.out.println("Insira a quantidade de produtos ");
		int quantidade = scanner.nextInt();
		double valor = 6.87;
		
		double total = (valor * quantidade);
		
		Produto produto = new Produto(quantidade, total);
		
		System.out.println("\nValor total:R$ " + produto.getTotal());
		
	}
}
