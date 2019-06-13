import java.util.Scanner;
public class uri1072 {
	public static void main(String args []) {
		Scanner info = new Scanner(System.in);
		int n = Integer.parseInt(info.nextLine());
		int numerosDentro = 0;
		int numFora = 0;
		for (int k = 0 ; k < n ; k++) {
			int num = Integer.parseInt(info.nextLine());;
			if(num >= 10 && num <= 20) {
				numerosDentro +=1;
				
			}else {
				numFora +=1;
			}
		}
		System.out.println(numerosDentro+" in");
		System.out.println(numFora+" out");
	}
	

}
