package encapsulamento;

public class RespRetangulo {
	public static void main(String[] args) {
	
		Retangulo ret1 = new Retangulo(4,3);
		
		double area = ret1.calcularArea();
		double perimetro = ret1.calcularPerimetro();
		System.out.printf("a area é %d e o perimetro é %d, o resultado é ",area, perimetro);
		}
}
