import java.util.Scanner;

public class uri1962 {
	public static void main(String [] args) {
		Scanner info = new Scanner(System.in);
		int n = Integer.parseInt(info.nextLine());
		for ( int k = 0 ; k< n ; k++) {
			int data = Integer.parseInt(info.nextLine());
			int ano = data - 2014;
			if ( ano > 0) {
				System.out.println(ano + " A.C.");
			}else if (ano <= 0) {
				ano = (ano *-1)+1;
				System.out.println(ano + " D.C.");
			}
			
		}
		
	}

}
