package encapsulamento;

public class Retangulo {

	private double base;
	private double altura;
	
	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	
	public void ajusteBase(double b) {
		this.base=b;
	}
	public double lerBase() {
		return base;
	}
	public void ajusteAltura(double a) {
		this.altura=a;
	}
	public double lerAltura() {
		return altura;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return 2*(base+altura);
	}
}
