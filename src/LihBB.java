import java.util.Scanner;

import javax.swing.JOptionPane;

public class LihBB {
	public static void main(String args[]) {

		Scanner info = new Scanner(System.in);
		JOptionPane.showInputDialog(" Ola , lih\n ja teve um programa pensado exclusivo para you?!", "S ou N");
		String res = info.nextLine();
		if (res.equals("s") || res.equals("S")) {
			System.out.println("Entao nao sou tao especial assim ne? :( ");
			if (res.equals("n") || res.equals("N")) {
				JOptionPane.showConfirmDialog(null, "Entao sou especial !!!!!!!\nEu acho");
				JOptionPane.showInputDialog(
						" entao, vamos começar.....\n ce sabe que gosto de ti ne, gostou de me ver de novo?", "S ou N");
				String res2 = info.nextLine();
				if (res2.equals("s") || res2.equals("S")) {
					JOptionPane.showConfirmDialog(null, "Tbm,gostei , na vdd eu amei :))");
				}
				JOptionPane.showInputDialog("Nao sei que horas estou lhe mostrando isto\n"
						+ "mas acho que fiz oque prometir trouxe chocolate :D, gostou?", "S ou N");
				String res3 = info.nextLine();
				if (res3.equals("s") || res.equals("S")) {
					JOptionPane.showConfirmDialog(null, "que bom ");

				}
			}

		}

	}

}
