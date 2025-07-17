package javaheranca;

public class Ciclista extends Atleta{
	public Ciclista(String nome, double idade, String pedalar, String pararPedalar ) {
		super(nome, idade);
		this.pedalar = pedalar;
		this.pararPedalar = pararPedalar; 
	}
	public String pedalar;
	public String pararPedalar; 
}
