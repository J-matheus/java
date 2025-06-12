package aula02;
import java.util.Scanner;
public class exercicio03 {
	public static void main(String[] args) {
		Scanner terceiro = new Scanner(System.in);
		System.out.println("Informe o número do dia correspondente: ");
		double resp = terceiro.nextDouble();
		if (resp<1 && resp>7) {
			System.out.println("Esse valor é inválido, Por gentileza digite um valor válido de 1/7");
		}
		if(resp==1) {
			System.out.println("Domingo");
		}
		else if (resp==2) {
			System.out.println("Segunda");
		}
		else if (resp==3) {
			System.out.println("Terça feira");
		}
		else if (resp==4) {
			System.out.println("Quarta feira");
		}
		else if (resp==5) {
			System.out.println("Quinta Feira");
		}
		else if (resp==6) {
			System.out.println("Sexta");
		}
		else if (resp==7) {
			System.out.println("Sábado");
		}
			
	}

}
