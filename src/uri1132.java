import java.util.Scanner;

public class uri1132 {
	public static void main(String args[]) {
		Scanner info = new Scanner(System.in);
		int n1 = Integer.parseInt(info.nextLine());
		int n2 = Integer.parseInt(info.nextLine());
		int resultado = 0;
		if (n1 < n2) {
			for (int k = n1; k <= n2; k++) {
				if (k % 13 != 0) {
					resultado += k;
				}
			}
		}
		if (n1 > n2) {
			for (int k = n1; k >= n2; k--) {
				if (k % 13 != 0) {
					resultado += k;
				}
			}
		}
		System.out.println(resultado);
	}
}
