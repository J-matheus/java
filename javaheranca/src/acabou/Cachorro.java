package acabou;

public class Cachorro extends Animal {
	
	 public Cachorro(String nome) {
		 super(nome);
	 }
	 
	 @Override
	 public void emitirSom() {
		 System.out.println(nome + "diz Au Au");
	 }
}
