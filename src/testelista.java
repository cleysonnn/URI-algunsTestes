import java.util.ArrayList;
import java.util.Scanner;

public class testelista {
	public static void main(String [] args) {
		ArrayList<String> listaNomes = new ArrayList<String>();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos nomes");
		int x = Integer.parseInt(leitor.nextLine());
		for (int k = 0; k <x ; k++) {
			System.out.println("digite um nome");
			String nome = leitor.nextLine();
			listaNomes.add(nome);
		}
		
		System.out.println("LISTA DE NOMES CADASTRADOS");
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
	}

}
