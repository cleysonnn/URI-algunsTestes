import java.util.Scanner;
public class exercicoSALARIO {
	
	public static void nomeIregulares(String [] nomeFuncionario  ,String [] CPF , double [] salarioFuncionario) {
		String inrregular = "";

		for (int k = 0 ; k < nomeFuncionario.length ; k++) {
			if (salarioFuncionario[k] < 954) {
				inrregular += nomeFuncionario[k]+" 3Com o CPF :"+ CPF[k] +"\n";
				
				
			}
			
			
		}
		System.out.println(inrregular);
	}
	
	public static void main(String [] args){
		System.out.println("quantos funcionarios serão pesquisados");
		Scanner dados = new Scanner(System.in);
		int n = Integer.parseInt(dados.nextLine());
		String [] nomeFuncionario = new String[n];
		String [] CPF = new String [n];
		double [] salarioFuncionario = new double[n];
		for (int k = 0 ; k < n ; k++) {
			System.out.println("Digite os dados da seguinte forma nome;CPF;salario");
			String [] fun = dados.nextLine().split(";");
			nomeFuncionario[k] = fun[0];
			CPF[k] = fun[1] ;
			salarioFuncionario[k] = Double.parseDouble(fun[2]);
			
			
		}
		System.out.println("Funcionarios inrregulares :");
		nomeIregulares(nomeFuncionario,CPF,salarioFuncionario);
		
	}

}
