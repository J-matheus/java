package metodos;

public class Carros {
	String modelo;
	String cor;
	Double preco;
	
	public Carros() {
		
	}
	public Carros(String modelo) {
		this.modelo=modelo;
	}
	public void exibir() {
		System.out.printf("modelo: %s /n"
				+ "cor: s%"
				+ "Preço: %d");
	}

	
}
