package aula02;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner quarto = new Scanner(System.in);
		System.out.println("Informe a primeiro nota do aluno: ");
		double resp = quarto.nextDouble();
		System.out.println("Informe a segunda nota do aluno: ");
		double resp2 = quarto.nextDouble();
		double media = (resp + resp2) /2;
		System.out.printf("O aluno Matheus tem como média %.2f%n",media);
	}

}
