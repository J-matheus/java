package acabou;

public class partyAnimals {
	public static void main(String[] args) {
		
		Cachorro C1 = new Cachorro("Lopping ");
		
		for(int i = 0; i < 1; i++) {
			C1.emitirSom();
			C1.dormir();
		}
		
		Gato G1 = new Gato("Misc ");
		
		for (int i = 0; i < 1; i++) {
			G1.emitirSom();
			G1.dormir();
		}
	}

}
