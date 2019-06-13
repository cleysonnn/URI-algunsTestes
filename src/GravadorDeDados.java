import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravadorDeDados {
	public List<String> recuperaTextoDeArquivos(String nomeArquivo) throws IOException{
		BufferedReader leitor = null;
		List<String> textoLido = new ArrayList<String>();
		try {
			leitor = new BufferedReader (new FileReader(nomeArquivo));
			String texto = null;
		
		do {
			texto = leitor.readLine();//ler a proxima linha
			if(texto != null) {
				textoLido.add(texto);
			}
		}while(texto!= null);//vai ser null quando chegar no fim do arquivo
	} finally{
		if (leitor != null) {
			leitor.close();// fecha o stream(fluxo) de leitura

		}
	}return textoLido;
}
	
	
	public void gravaTextoEmArquivos(List<String> texto , String nomeArquivo) throws IOException{
		BufferedWriter gravador = null;
		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
			for (String s : texto){
				gravador.write(s+"\n");
			}
			
		}finally {
			if(gravador != null) {
				gravador.close();
			}
		}
		
	}

}

