package acabou;

public class Gato extends Animal {
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + "diz Miau Miau");
	}
}
