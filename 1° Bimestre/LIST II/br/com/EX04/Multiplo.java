package br.com.EX04;

public class Multiplo {
	
	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Insira o primeiro n�mero: ");
		num1 = leitura.nextInt();
		System.out.printf("Insira o segundo n�mero; ");
		num2 = leitura.nextInt();
		
		if(num1%num2==0) {
			System.out.printf("O n�mero %d � m�ltiplo de %d", num1, num2);
		}
		
		else {
			System.out.printf("O n�mero %d n�o � m�ltiplo de %d", num1, num2);
		}
		
		
		
		
	}
}
