import java.util.Scanner;
public class exercicio4 {
	public static void main(String [] ags) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("CALCULANDO NOTAS DA TURMA");
		System.out.println("Quantos alunos há na turma?");
		int numAlunos = Integer.parseInt(leitor.nextLine());
		String[] listaNomes = new String[numAlunos];
		double[] listaNotas = new double[numAlunos];
		double MaiorNota = listaNotas[0];
		String NomeMaiorNota = "";
		for (int k = 0; k < numAlunos; k++) {
		System.out.println("Qual o nome do aluno [" + (k + 1) + "]");
		listaNomes[k] = leitor.nextLine();
		System.out.println("Qual a nota do aluno [" + (k + 1) + "]");
		listaNotas[k] = Double.parseDouble(leitor.nextLine());

		if( listaNotas[k] >= MaiorNota) {
			MaiorNota = listaNotas[k];
			NomeMaiorNota = listaNomes[k];
	}
		
		}
		System.out.println("maior nota: "+ MaiorNota + " e o aluno com esta nota: "+ NomeMaiorNota);
		leitor.close();
		
		
	}
}