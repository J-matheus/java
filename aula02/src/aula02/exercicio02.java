package aula02;

public class exercicio02 {
	public static void main(String[] args) {
		
		int prim = 6;
		int segu = 9;
		int terc = 2;
	    
		if(prim>segu && prim>terc)
			System.out.printf("O valor de %d é o maior deles",prim);
		else if(segu>prim && segu>terc)
			System.out.printf("O valor de %d é o maior deles",segu);
		else
			System.out.printf("O valor de %d é o maior deles",terc);
		
		
	}

}
