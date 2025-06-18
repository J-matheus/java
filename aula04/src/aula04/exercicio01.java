package aula04;
import java.util.Scanner;
public class exercicio01 {
	public static void main(String[] args) {
		double[] notas = new double [5];
		double soma=0, media=0;
		Scanner primeiro = new Scanner(System.in);
		
		for(int i=0; i<notas.length; i++) {
		
		System.out.printf("informe a %d nota: ", i );
		notas[i]=primeiro.nextInt();
		
		}
		for (double nota: notas) {
			soma+=nota;
			
		}
		media = soma/5;
		System.out.println(media);
	}

}
