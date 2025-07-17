package javaheranca;

public abstract class Atleta {
	
	public String nome;
	public double idade;
	
	public Atleta(String nome, double idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	public void aquecer() {
		System.out.printf(this.nome + "Está aquecendo.");
	}
	
}
