package metodos;

public class Calculadora {
	public static void main(String[] args) {
		CalcularMetodos resp = new CalcularMetodos();
		
		int resultado_soma = resp.somar(8, 3);
		System.out.println(resultado_soma);
		resultado_soma = resp.somar(1, 3, 6);
		System.out.println(resultado_soma);
		
		int resultado_subtracao = resp.subtracao(8,3);
		System.out.println(resultado_subtracao);
	    resultado_subtracao = resp.subtracao(8,3,9);
	    System.out.println(resultado_subtracao);
}


}
