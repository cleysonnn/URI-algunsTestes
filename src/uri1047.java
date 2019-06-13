import java.util.Scanner;

public class uri1047 {
	public static void main(String[] args) throws InterruptedException {
		Scanner info = new Scanner(System.in);
		String [] horas = info.nextLine().split(" "); 
		int horasinical = Integer.parseInt(horas[0]);
		int minutoinicial = Integer.parseInt(horas[1]);
		int horasfinal = Integer.parseInt(horas[2]);
		int minutofinal = Integer.parseInt(horas[3]);
		int duracao = 0;
		if(horasinical < horasfinal ) {
			int horasP = horasinical - horasfinal;
			int minutosp = minutoinicial - minutofinal;
			if ( minutosp < 0 ) {
				minutosp *= -1; 
			}
			if ( horasP < 0) {
				horasP *= -1;
			}
			
			System.out.println("O JOGO DUROU "+ horasP+" HORA(S) E " + minutosp+ " MINUTO(S)");
		}
		
		if (horasinical < horasfinal && minutoinicial > minutofinal ) {
			
			
			
		}
		Thread.sleep(10);
		if(horasinical > horasfinal) {
			int horasP = horasinical - horasfinal;
			if(horasP < 0) {
				horasP = 0;
				minutofinal += 60;
			}
			int minutosp = minutoinicial - minutofinal;
			if ( minutosp < 0 ) {
				minutosp *= -1; 
			}
			System.out.println("O JOGO DUROU "+ horasP+" HORA(S) E " + minutosp+ " MINUTO(S)");
		}
		if (horasinical == horasfinal && minutoinicial == minutofinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		
	}
}
