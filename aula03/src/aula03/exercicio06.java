package aula03;
import java.util.Scanner;
public class exercicio06 {
	public static void main(String[] args) {
		Scanner seis = new Scanner(System.in);
		for (int x = 1; x < 100; x++) {
			if (x%3 == 0) {
				System.out.println(x);
			}
		}
	}
}
