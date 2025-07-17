package javaheranca;

public class Corredor extends Atleta {
	public Corredor(String nome, double idade, String correr, String pararCorrer) {
		super(nome,idade);
		this.correr = correr;
		this.pararCorrer = pararCorrer;
}
	public String correr;
	public String pararCorrer;
}
