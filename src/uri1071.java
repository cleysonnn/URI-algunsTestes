import java.util.Scanner;
public class uri1071 {
	public static void main(String args[]) {
		Scanner info = new Scanner(System.in);
		int num1 = Integer.parseInt(info.nextLine());
		int num2 = Integer.parseInt(info.nextLine());
		int resultado = 0;
		for (int k = num2+1 ; k < num1 ; k++) {
			if (k%2 != 0) {
				resultado += k;
				
			}
			
		}
		System.out.println(resultado);
		
	}

}
