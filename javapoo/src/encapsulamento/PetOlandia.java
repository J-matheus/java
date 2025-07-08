package encapsulamento;

public class PetOlandia {
	
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.ajustarNome("Garfield");
		String nome1 = pet1.lerNome();
		
		pet1.ajustarIdade(5);
		int idade1 = pet1.lerIdade();
		
		pet1.ajustarTipo("Gato");
		String tipo1 = pet1.lerTipo();
		
		pet1.ajustarRaca("Gato caramelo");
		String raca1 = pet1.lerRaca();
		
		System.out.printf("O meu %s, tem %d anos e se chama %s, ele é da raça %s",tipo1, idade1, nome1, raca1);
	}

}
