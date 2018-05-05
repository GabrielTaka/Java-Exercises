package Ex02;
import java.util.Scanner;

public class Inicio {
	public static void main(String args[]) {
		Scanner scanner = new Scanner (System.in);
		String[][] tam =  new String [20][20];
		
		for(int i=0; i <20;i++) {
			for(int j = 0; j<20 ; j++) {
				tam [i][j] = "*";
			}
		}
		
		for(int i=0; i <20;i++) {
			for(int j = 0; j<20 ; j++) {
				System.out.println(tam[i][j]);
			}
		}
		
		System.out.println("Insira o tamanho do seu quadrado: ");
		byte tamanho = scanner.nextByte();
	}
}
