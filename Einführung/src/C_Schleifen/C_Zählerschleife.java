package C_Schleifen;

public class C_Zählerschleife {

	public static void main(String[] args) {
		
		int i = 1;
		
		for(i = 1; i <= 1000000; i++) {
			System.out.println(i);
			
			if(i == 1000000) {
			System.out.println("i = eine Milionen");
			}
			else System.out.println("Ist nicht eine Milionen" + i);
				
		}
		
	}

}
