import java.util.Scanner;

public class uri1151 {
	public static void main(String args []) {
		Scanner info = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		int n = Integer.parseInt(info.nextLine());
		String resu =n1 + " " +n2 ;
		if(n == 1) {
			System.out.println(0);
		}else if(n ==2) {
			System.out.println(0+" "+1);
		}
		if(n>2) {
			while (n-2 > 0) {
				int n3 = n1 + n2;
				resu +=" "+ n3;
				n1 = n2;
				n2 = n3;
				n -= 1;
			}
			
			System.out.println(resu);
			
			
		}
	
	}
}
