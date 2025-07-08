package encapsulamento;

public class Retangulo {

	private int base;
	private double altura;
	
	public void ajusteBase(int b) {
		this.base=b;
	}
	public int lerBase() {
		return base;
	}
	public void ajusteAltura(double a) {
		this.altura=a;
	}
	public double lerAltura() {
		return altura;
	}
}
