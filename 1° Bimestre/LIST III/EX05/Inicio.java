package EX05;

public class Inicio {
	
	public static void main(String[] args) {
		
		int numeros [] = new int [1000];
		int add = 1;
		
		for(int i = 0 ; i < 1000; i++){
			add = add + 1;
			numeros[i] = add;
		}
		
		
		
		for(int i = 0; i < numeros.length; i++) {
			int count = 0;
			for(int j = 1; j <= numeros[i]; j++) {
				if(numeros[i]%j==0) {
					count = count + 1;
				}
				
			}
			if(count == 2) {
				System.out.println(numeros[i]);
			}
		}
	}
	
}
