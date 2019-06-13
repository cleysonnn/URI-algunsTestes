import java.util.Scanner;

public class uri2763 {
	public static void main(String [] args) {
		Scanner info = new Scanner(System.in);
		String cpf [] = info.nextLine().split("\\.|-");
		String a = cpf[0];
		String b = cpf[1];
		String c = cpf[2];
		String d = cpf[3];
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
