package aula02;
import java.util.Scanner;
public class exercicio06 {
	public static void main(String[] args) {
		Scanner sexto = new Scanner(System.in);
		int cont =0;
		
		System.out.println("Telefonou para a vítima ? s/n");
		char resp1 = sexto.next().charAt(0);
		System.out.println("Esteve no local ? s/n");
		char resp2 = sexto.next().charAt(0);
		System.out.println("Mora perto da vítima ? s/n");
		char resp3 = sexto.next().charAt(0);
		System.out.println("Devia para a vítima ? s/n");
		char resp4 = sexto.next().charAt(0);
		System.out.println("Já trabalhou para a vítima ? s/n");
		char resp5 = sexto.next().charAt(0);
		
		if(resp1=='s') {
			cont= cont+1;}
		else if(resp2=='s') {
			cont= cont+1;}
		else if(resp3=='s') {
			cont= cont+1;}
		else if(resp4=='s') {
			cont= cont+1;}
		else if(resp5=='s') {
			cont= cont+1;}
		
		if (cont==0) {
			System.out.println("Inocente");}
		if(cont==2) {
			System.out.println("Suspeito");}
		else if (cont==3 || cont==4) {
			System.out.println("Cúmplice");}
		else if (cont==5) {
			System.out.println("Assassino");}
		
		System.out.println(cont);
			
		}	
	}		