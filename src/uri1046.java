import java.util.Scanner;

public class uri1046 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		String [] horas = info.nextLine().split(" "); 
		int inicio = Integer.parseInt(horas[0]);
		int fim = Integer.parseInt(horas[1]);
		int duracao = 0;
		if(inicio >= fim) {
			fim += 24;
			duracao = inicio - fim;
			System.out.println("O JOGO DUROU "+duracao * -1  +" HORA(S)");
		}else if (fim > inicio) {
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
	}
}
