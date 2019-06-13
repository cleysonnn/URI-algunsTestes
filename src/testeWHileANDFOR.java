import java.util.Scanner;
public class testeWHileANDFOR {

	public static void main(String [] args) {

		Scanner info = new Scanner(System.in);
		String [] num = info.nextLine().split(" ");
		double a = Double.parseDouble(num[0]);
		double b = Double.parseDouble(num[1]);
		double c = Double.parseDouble(num[2]);
		if((b-c) < a && a < (b + c)) {
			double perimetro = (a+b+c);
			System.out.println("Perimetro = "+perimetro);
			
		}else {
			double area = c*(a+b)/2;
			System.out.println("Area = "+area);
			info.close();
 
		
		}
		
	}
	

}
