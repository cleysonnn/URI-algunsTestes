
public class TesteTratarErro extends Exception {
	private int a;
	public TesteTratarErro(int a) {
		this.a = a;
	}
	
	
	public String toString() {
		return "deu ruim";
	}

}
