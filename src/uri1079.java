import java.util.Scanner;

public class uri1079 {
	public static void main(String args[]) {
		Scanner info = new Scanner(System.in);
		int n = Integer.parseInt(info.nextLine());
		for (int k=0 ; k < n ; k++ ) {
			String notas[] = info.nextLine().split(" ");
			double nota1 = Double.parseDouble(notas[0]);
			double nota2 = Double.parseDouble(notas[1]);
			double nota3 = Double.parseDouble(notas[2]);
			double resultado = ((nota1*2) + (nota2 * 3) + (nota3 * 5))/(2+3+5);
			System.out.printf("%.1f\n",resultado);
		}
		
	}
}
