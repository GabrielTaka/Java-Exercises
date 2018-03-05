package br.com.EX08;

public class Criptografia {
	
	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		int nums = 0;
		
		System.out.printf("Insira o número a ser criptografado: ");
		nums = leitura.nextInt();
		
		if(Integer.toString(nums).length() != 4) {
			System.out.println("Erro, o número deve possuir 4 digitos.");
		}
		
		else {
			int a1= 0, a2 = 0, a3 = 0, a4 = 0, aux = 0;
			
			a4 = nums % 10;
			nums = nums / 10;
			
			a3 = nums % 10;
			nums = nums / 10;
			
			a2 = nums % 10;
			nums = nums / 10;
			
			a1 = nums;
			
			a1 = (a1 + 7) % 10;
			a2 = (a2 + 7) % 10;
			a3 = (a3 + 7) % 10;
			a4 = (a4 + 7) % 10;
			
			aux = a1;
			
			a1 = a3;
			
			a3 = aux;
			
			aux = a2;
			
			a2 = a4;
			
			a4 = aux;
			
			System.out.printf("Número: %d%d%d%d ", a1, a2, a3, a4);
		}
	}
}
