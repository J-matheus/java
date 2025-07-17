package javaheranca;

public class Nadador extends Atleta{
	public Nadador(String nome, double idade, String nadar, String pararNadar) {
		super(nome, idade);
		this.nadar = nadar;
		this.pararNadar = pararNadar;
	}
	public String nadar;
	public String pararNadar;
}
