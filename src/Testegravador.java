import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Testegravador {
	public static void main(String args[]) {

		GravadorDeDados gravador = new GravadorDeDados();
		List<String> texto = new ArrayList<String>();
		int linhas = Integer.parseInt(JOptionPane.showInputDialog("quantas linhas para se add"));
		for (int k = 0; k < linhas; k++) {
			texto.add(JOptionPane.showInputDialog("digite  a proxima linha"));

		}
		try {
			gravador.gravaTextoEmArquivos(texto, "teste.txt");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
