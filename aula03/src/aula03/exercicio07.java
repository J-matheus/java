package aula03;
import java.util.Scanner;
public class exercicio07 {
	public static void main(String[] args) {
		Scanner sete = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos: ");
		int qtd = sete.nextInt();
		double soma=0;
		for (int x=0; x<qtd ; x++) {
			System.out.println(x);
			
			System.out.println("Informe a nota: ");
			soma+=sete.nextDouble();
		}
		double media = soma/qtd;
		System.out.println(media);
		
	}

}
