import java.util.Scanner;
public class uri1050 {
	public static void main(String [] args) {
		Scanner infor = new Scanner(System.in);
		int DDD = Integer.parseInt(infor.nextLine());
		if(DDD == 61 ) {
			System.out.println("Brasilia");
		}else if(DDD == 71) {
			System.out.println("Salvador");
		}else if(DDD == 31) {
			System.out.println("Belo Horizonte");
		}else if(DDD == 11) {
			System.out.println("Sao Paulo");
		}else if(DDD == 21) {
			System.out.println("Rio de Janeiro");
		}else if(DDD == 32) {
			System.out.println("Juiz de Fora");
		}else if(DDD == 19) {
			System.out.println("Campinas");
		}else if(DDD == 27) {
			System.out.println("Vitoria");
		}else {
			System.out.println("DDD nao cadastrado");
		}
		infor.close();
	}

}
