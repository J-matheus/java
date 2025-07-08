package encapsulamento;

public class TesteNumeros {
	public static void main(String[] args) {
		Numeros n1 = new Numeros();
		n1.ajustarNum(20);
		int valor = n1.lerNum();
		System.out.println(valor);
	}
}
