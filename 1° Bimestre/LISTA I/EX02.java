package EX02;

public class RevisaoIfElse {

	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println ("Insira um n�mero inteiro para o n�mero 1: ");
		numero1 = leitor.nextInt();
		
		System.out.println("Insira um n�mero inteiro para o n�mero 2: ");
		numero2 = leitor.nextInt();
		
		
		
		if(numero1 > numero2){
			System.out.println("O primeiro n�mero � maior que o segundo n�mero!");
			
		}
		
		if(numero2 > numero1){
			System.out.println("O segundo n�mero � maior que o primeiro n�mero!");
		}
		
		if(numero1 == numero2){
			System.out.println("Os dois n�meros possuem o mesmo valor!");
		}
	}
	
	
}		
