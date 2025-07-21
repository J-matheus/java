package acabou;

public class TriAtleta implements Corredor, Nadador,Ciclista {
	
	public String aquecer;
	public String pedalar;
	public String pararPedalar;
	public String nadar;
	public String pararNadar;
	public String correr;
	public String pararCorrer;
	
	public TriAtleta(String aquecer, String pedalar, String pararPedalar, String nadar, String pararNadar, String correr, String pararCorrer) {
		this.aquecer = aquecer;
		this.pedalar = pedalar;
		this.pararPedalar = pararPedalar;
		this.nadar = nadar;
		this.pararNadar = pararNadar;
		this.correr = correr;
		this.pararCorrer = pararCorrer;
		
		
	}
	
	@Override
	public void aquecer() {
	}
	@Override
	public void pedalar() {
	}
	@Override
	public void pararPedalar() {
	}
	@Override
	public void nadar() {
	}
	@Override
	public void pararNadar() {
	}
	@Override
	public void correr() {
	}
	@Override
	public void pararCorrer() {
	}
	
	@Override
    public String toString() {
        return aquecer + pedalar + pararPedalar + nadar + pararNadar + correr + pararCorrer;
}
}