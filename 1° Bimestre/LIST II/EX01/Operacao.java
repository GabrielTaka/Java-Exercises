package EX01;
import EX01.Interios;


public class Operacao {
	public static void main(String args[]) {
		Interios numero = new Interios();
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		
		System.out.printf("Insira o primeiro n�mero: ");
		numero.num1 = leitura.nextInt();
		
		System.out.printf("Insira o segundo n�mero: ");
		numero.num2 = leitura.nextInt();
		
		System.out.printf("SOMA = %d\n", numero.num1 + numero.num2);
		System.out.printf("SUBTRA��O = %d\n", numero.num1 - numero.num2);
		System.out.printf("PRODUTO = %d\n", numero.num1 * numero.num2);
		System.out.printf("DIVIS�O = %d\n", numero.num1 / numero.num2);
		
	}

}
