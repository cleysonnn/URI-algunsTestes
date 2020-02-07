import java.util.Scanner;
public class exercicio01 {
	public static void main(String [] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("quantos alunos há na sala?");
		int numAlunos = Integer.parseInt(leitor.nextLine());
		double maiorNota = -1;
		String nomeMaior = "";
		for (int k = 0 ; k < numAlunos ; k++) {
			System.out.println("digite o nome,nota e matricula do aluno "+(k+1)+":");
			String [] infoAluno = leitor.nextLine().split(";");
			String NomeAluno = infoAluno[0];
			double notaAluno = Double.parseDouble(infoAluno[1]);
			String matAluno = infoAluno[2];
			if (notaAluno > maiorNota){
				maiorNota = notaAluno;
				nomeMaior = matAluno;
			
			}
		
			
		}
		
		System.out.println(maiorNota + nomeMaior );
	
	

	}
}
