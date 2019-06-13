import java.util.Scanner;

public class uri1045 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		String[] numeros = info.nextLine().split(" ");
		double a = Double.parseDouble(numeros[0]);
		double b = Double.parseDouble(numeros[1]);
		double c = Double.parseDouble(numeros[2]);
		if (a < b && b > c) {
			double d = a;
			double e = b;
			double f = c;
			a = e;
			b = d;
			c = f;
		}
		if (a < c && c > b) {
			double d = a;
			double e = b;
			double f = c;
			a = f;
			b = e;
			c = d;
		}
		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if ((a * a) > ((b * b) + (c * c))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (a * a == ((b * b) + (c * c))) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if (a * a < ((b * b) + (c * c))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		info.close();

	}

}
