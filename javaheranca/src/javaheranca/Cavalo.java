package javaheranca;

public class Cavalo extends Animal {
	
	public Cavalo(String nome) {
		super(nome);
	}
	public void comer(String comida) {
		System.out.printf("Foi comer %d",comida);
	}

	public void comer(String estado, String comida) {
		System.out.printf("%S foi comer %S e ficou %s",nome, comida, estado);
	}
}
