package javapoo;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	String genero;
	
	public void comer(String comida) { 
		System.out.printf("%s começou a comer %s!",nome,comida);
		
	}
	public void exibir() {
		System.out.printf("%s tem %d anos, ele possui %f metros e é do gênero %s",nome, idade, altura, genero);
	}
	

}
