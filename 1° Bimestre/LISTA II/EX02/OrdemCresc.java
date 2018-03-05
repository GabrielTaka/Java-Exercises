package EX02;
import EX02.Numeros;

public class OrdemCresc {
	public static void main(String args[]) {
		Numeros numero = new Numeros();
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		System.out.printf("Insira o primeiro número: ");
		numero.num1 = leitura.nextInt();
		
		System.out.printf("Insira o segundo número: ");
		numero.num2 = leitura.nextInt();
		
		System.out.printf("SOMA = %d\n ", numero.num1 + numero.num2);
		System.out.printf("MÉDIA = %d\n ", (numero.num1 + numero.num2)/2);
		
		if(numero.num1 > numero.num2) {
			System.out.println("ORDEM CRESC:  "+ numero.num2 + "," + numero.num1);
		}
		else {
			System.out.println("ORDEM CRESC:  "+ numero.num1 + "," + numero.num2);
		}
	}
}
