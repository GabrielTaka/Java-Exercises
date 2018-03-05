package br.com.EX03;

public class maiorMenor {
	
	public static void main(String args[]) {
		java.util.Scanner leitura = new java.util.Scanner(System.in);	
		int [] array = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Insira o número: ");
			array [i] = leitura.nextInt();
			
		}
		
		int auxMenor = array[0];
		int auxMaior = array[0];
		
		for(int x = 0; x < 5; x++) {
			if(auxMenor > array[x]) {
				auxMenor = array[x];
			}
			
			if(auxMaior < array[x]) {
				auxMaior = array[x];
			}
			
			
		}
		
		System.out.println(auxMenor);
		System.out.println(auxMaior);
		
		
		
		
		
		
		
	
	}

}
