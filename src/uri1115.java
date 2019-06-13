import java.util.Scanner;

public class uri1115 {
	public static void main(String args[]) {
		Scanner info = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			String[] XY = info.nextLine().split(" ");
			int x = Integer.parseInt(XY[0]);
			int y = Integer.parseInt(XY[1]);
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}else if(x == 0 || y ==0) {
				continuar = false;
			}

		}
	}
}