package Ex03;

public class IfElse2 {

	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite o valor do primeiro n�mero: ");
		
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o valor do segundo n�mero: ");
		
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2){
			System.out.println("O maior valor � o primeiro n�mero!");
		}
		
		else if(numero2 < numero1){
			System.out.println("O maior valor � o segundo n�mero!");
			
		}
		
		if(numero1 == numero2){
			System.out.println("Os valores s�o iguais.");
		}
		
		else if(numero1 != numero2){
			System.out.println("Os valore s�o diferentes!");
		
		}
		
		
	}
}
