import java.util.Scanner;

public class uri1116 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int n = Integer.parseInt(info.nextLine());
		double[] divisor = new double[n];
		double[] dividendo = new double[n];
		double resultado = 0;
		for (int k = 0; k < n; k++) {
			String[] num = info.nextLine().split(" ");
			divisor[k] = Double.parseDouble(num[0]);
			dividendo[k] = Double.parseDouble(num[1]);

			if (dividendo[k] == 0) {
				System.out.println("divisao impossivel");
			} else if (dividendo[k] != 0) {
				resultado = divisor[k] / dividendo[k];
				System.out.printf("%.1f\n", resultado);
			}
		}
	}
}
