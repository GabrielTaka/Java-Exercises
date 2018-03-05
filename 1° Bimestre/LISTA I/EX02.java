package EX02;

public class RevisaoIfElse {

	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println ("Insira um número inteiro para o número 1: ");
		numero1 = leitor.nextInt();
		
		System.out.println("Insira um número inteiro para o número 2: ");
		numero2 = leitor.nextInt();
		
		
		
		if(numero1 > numero2){
			System.out.println("O primeiro número é maior que o segundo número!");
			
		}
		
		if(numero2 > numero1){
			System.out.println("O segundo número é maior que o primeiro número!");
		}
		
		if(numero1 == numero2){
			System.out.println("Os dois números possuem o mesmo valor!");
		}
	}
	
	
}		
