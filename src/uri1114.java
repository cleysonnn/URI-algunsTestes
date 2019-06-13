import java.util.Scanner;

public class uri1114 {
	public static void main(String args []) {
		Scanner info = new Scanner(System.in);
		boolean sen = true;
		String senha= "2002";
		while(sen ==true) {
			String senhain = (info.nextLine());
			if (senhain.equals(senha)) {
				System.out.println("Acesso Permitido");
				sen = false;
			}else {
				System.out.println("Senha Invalida");
				
			}
			
			
		}
		
	}
}
