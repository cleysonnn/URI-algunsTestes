import java.util.Scanner;
public class uri1172 {
	public static void main(String [] args) {
		int [] numeros = new int[10];
		Scanner input = new Scanner(System.in);
	
		for(int k =0 ;k < 10; k++) {
			numeros[k] = Integer.parseInt(input.nextLine());
			if(numeros[k] <= 0) {
				numeros[k] = 1;
				
			}
			System.out.println("X["+ k +"]"+" = "+numeros[k]);
			
		}
		input.close();
	}
	

}
