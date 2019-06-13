import javax.swing.JOptionPane;

public class TestaErros {
	public static void main(String args[]) {
		String login = JOptionPane.showInputDialog("qual seu nome");
		String senha = JOptionPane.showInputDialog("qual sua senha");
		try {
			int senhaNumerica = Integer.parseInt(senha);
			System.out.println();
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,
					"Senha invalida,use apenas numeros \n detalhes do erro" + erro.getMessage());
		}
	}

}
