package aula03;
import java.util.Scanner;
public class exercicio01 {
	public static void main(String[] args) {
		int nAlunos= 0, x=0;
		double notas= 0, soma= 0, media=0;
		Scanner um = new Scanner(System.in);
		
		System.out.println("Informe quantos alunos tem na sua sala: ");
		nAlunos = um.nextInt();

		while (x < nAlunos ) {
			System.out.printf("Informe a nota %d",x+1);
			soma+= um.nextDouble();
			x++;
			System.out.println(notas);
			
		}

}
}
