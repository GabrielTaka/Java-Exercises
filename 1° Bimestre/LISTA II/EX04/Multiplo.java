package br.com.EX04;

public class Multiplo {
	
	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Insira o primeiro número: ");
		num1 = leitura.nextInt();
		System.out.printf("Insira o segundo número; ");
		num2 = leitura.nextInt();
		
		if(num1%num2==0) {
			System.out.printf("O número %d é múltiplo de %d", num1, num2);
		}
		
		else {
			System.out.printf("O número %d não é múltiplo de %d", num1, num2);
		}
		
		
		
		
	}
}
