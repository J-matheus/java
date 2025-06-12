package aula03;
import java.util.Scanner;
public class exercicio09 {
public static void main(String[] args) {
	Scanner nove= new Scanner(System.in);
	int a[] = new int [4];
	int b[] = new int [4];
	int c[] = new int [4];
	int d[] = new int [4];
	
	int tamanho=a.length;
	
	for (int x=0; x<tamanho; x++) {
		System.out.println("digite o valor de A: ");
		a[x]=nove.nextInt();
		System.out.println("digite o valor de B: ");
		b[x]=nove.nextInt();
		System.out.println("digite o valor de C: ");
		c[x]=nove.nextInt();
		System.out.println("digite o valor de D: ");
		d[x]=nove.nextInt();
	}
}
}
