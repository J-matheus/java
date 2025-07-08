package encapsulamento;

public class RespRetangulo {
	public static void main(String[] args) {
		double calculo = 0;
		Retangulo ret1 = new Retangulo();
		ret1.ajusteBase(7);
		int base1 = ret1.lerBase();
		ret1.ajusteAltura(8);
		double altura1 = ret1.lerAltura();
		
		System.out.println();
		}
}
