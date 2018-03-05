package Ex03;

public class IfElse2 {

	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite o valor do primeiro número: ");
		
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2){
			System.out.println("O maior valor é o primeiro número!");
		}
		
		else if(numero2 < numero1){
			System.out.println("O maior valor é o segundo número!");
			
		}
		
		if(numero1 == numero2){
			System.out.println("Os valores são iguais.");
		}
		
		else if(numero1 != numero2){
			System.out.println("Os valore são diferentes!");
		
		}
		
		
	}
}
