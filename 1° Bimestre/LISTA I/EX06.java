package EX06;

public class Calculadora {

	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		
		boolean executar = true;
		int escolha = 0;
		
		while(executar) {
			System.out.println("Calculadora!!");
			System.out.println("[1] SOMA!");
			System.out.println("[2] SUBTRA��O!");
			System.out.println("[3] MULTIPLICA��O!");
			System.out.println("[4] DIVIS�O!");
			System.out.println("[5] SAIR!");
			
			System.out.printf("Escolha a op��o desejada: ");
			escolha = leitura.nextInt();
			
			
			if(escolha == 1) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro n�mero: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo n�mero:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma �: %d\n", num1 + num2);
			}
			
			if(escolha == 2) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro n�mero: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo n�mero:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma �: %d\n", num1 - num2);
			}
			
			if(escolha == 3) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro n�mero: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo n�mero:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma �: %d\n", num1 * num2);
			}
		
			if(escolha == 4) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro n�mero: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo n�mero:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma �: %d\n", num1 / num2);
			}
			
			if(escolha == 5) {
				executar = false;
			}
		}
		
		
	}
}
