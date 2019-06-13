import java.util.Scanner;

public class uri1153 {
	public static void main(String args[]) {
		Scanner info = new Scanner(System.in);
		int num = Integer.parseInt(info.nextLine());
		int resultado = 1 ;
		
		
		for (int k = 1 ; k <= num ; k++ ) {
			resultado *= k;
		}
			
		

		System.out.println(resultado);
	}
}
