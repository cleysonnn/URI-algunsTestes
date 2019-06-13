import java.util.Scanner;
public class uri1165 {
	 
	    public static void main(String[] args){
	 
	       		Scanner numero = new Scanner(System.in);
			int i = Integer.parseInt(numero.nextLine());
			for (int k = 1; k <= i;k++) {
				int a = Integer.parseInt(numero.nextLine());
				if(a==1) {
					System.out.println(a +" nao eh primo");
				}else if (a== 2 || a==3 || a==5|| a==7) {
			
					System.out.println(a + " eh primo");
				}
				else if (a%2 != 0 && a%3 != 0 && a%5 != 0 && a%7 != 0) {
					System.out.println(a + " eh primo");
				}else if (a%2 == 0 || a%3 == 0 || a%5 == 0 || a%7 == 0) {
					System.out.println(a + " nao eh primo");
				}
				}
	    }
}
