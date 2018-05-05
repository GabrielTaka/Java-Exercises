package EX04;



public class Inicio {
	
	public boolean multiplo(int v1, int v2) {
		
		if((v2 % v1) == 0) {
			
			return true;
		
		} else {
			
			return false;
			
		}
		
	}
	
	public static void main(String[] args) {
	
		Inicio mult = new Inicio();
		
		System.out.println(mult.multiplo(14, 28));
		
	}

}