package encapsulamento;

public class Pet {
	
	private String nome, tipo, raca;
	private int idade;
	
	public void ajustarNome(String n) {
		this.nome=n;
	}
	public String lerNome() {
		return nome;
	}
	public void ajustarIdade(int i) {
		this.idade=i;
	}
	public int lerIdade() {
		return idade;
	}
	public void ajustarTipo(String t) {
		this.tipo=t;
	}
	public String lerTipo() {
		return tipo;
	}
	public void ajustarRaca(String r) {
		this.raca=r;
	}
	public String lerRaca() {
		return raca;
	}
}
