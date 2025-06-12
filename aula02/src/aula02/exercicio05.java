package aula02;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner quinto =new Scanner(System.in);
		System.out.println("Digite um letra.  F/M");
		char resp = quinto.next().charAt(0);
		
		if(resp=='f') {
			System.out.println("Feminino");
		}
		else if (resp=='m') {
			System.out.println("Masculino");
		}
		
	}

}
