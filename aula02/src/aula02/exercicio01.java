package aula02;
import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		System.out.println("Informe um número: ");
		double resp = first.nextDouble();
		if(resp==0) {
			System.out.println("Zero");
		}
		else if (resp>0) {
			System.out.println("Esse número é positivo"); 
			}
		else {
			System.out.println("Esse valor é negativo"); 
			}
	}
}
