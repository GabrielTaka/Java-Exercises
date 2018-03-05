package EX06;

public class Calculadora {

	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		
		
		boolean executar = true;
		int escolha = 0;
		
		while(executar) {
			System.out.println("Calculadora!!");
			System.out.println("[1] SOMA!");
			System.out.println("[2] SUBTRAÇÃO!");
			System.out.println("[3] MULTIPLICAÇÃO!");
			System.out.println("[4] DIVISÃO!");
			System.out.println("[5] SAIR!");
			
			System.out.printf("Escolha a opção desejada: ");
			escolha = leitura.nextInt();
			
			
			if(escolha == 1) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro número: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo número:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma é: %d\n", num1 + num2);
			}
			
			if(escolha == 2) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro número: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo número:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma é: %d\n", num1 - num2);
			}
			
			if(escolha == 3) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro número: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo número:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma é: %d\n", num1 * num2);
			}
		
			if(escolha == 4) {
				int num1 = 0;
				int num2 = 0;
				
				System.out.printf("Insira o primeiro número: ");
				num1 = leitura.nextInt();
				
				System.out.printf("Insira o segundo número:");
				num2 = leitura.nextInt();
				
				System.out.printf("A soma é: %d\n", num1 / num2);
			}
			
			if(escolha == 5) {
				executar = false;
			}
		}
		
		
	}
}
