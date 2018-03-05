package br.com.EX0802;
import java.util.Scanner;


public class Descriptografia {

		public static void main(String args[]) {
			
			Scanner leitura = new Scanner(System.in);
			
			int nums = 0;
			
			System.out.printf("Insira o número criptografado: ");
			nums = leitura.nextInt();
			
			if(Integer.toString(nums).length() != 4) {
				System.out.println("Número inválido!");
			}
			
			else {
				int a1,a2,a3,a4, aux;
				
				a4 = nums % 10;
				nums = nums / 10;
				a4 = (a4 + 3) % 10;
				
				a3 = nums % 10;
				nums = nums / 10;
				a3 = (a3 + 3) % 10;
				
				a2 = nums % 10;
				nums = nums / 10;
				a2 = (a2 + 3) % 10;
				
				a1 = nums;
				a1 = (a1 + 3) % 10;
				
				aux = a1;
				a1 = a3;
				a3 = aux;
				
				aux = a2;
				a2 = a4;
				a4 = aux;
				
				
				System.out.printf("Descriptografia: %d%d%d%d", a1,a2,a3,a4);
			}
			
		}
}
