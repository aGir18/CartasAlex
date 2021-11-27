package es.lanyu.cartas;

public class Carta {

	private String palo;
	private int numeroCarta;
	private String figuraCarta;
	
	public int getNumeroCarta() {
		return numeroCarta;
	}
	
	public String getFiguraCarta() {
		return figuraCarta;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public Carta(String palo, int numeroCarta) {
		this.palo = palo;
		this.numeroCarta = numeroCarta;		
	}

	public Carta(String palo, String figuraCarta) {
		this.palo = palo;
		this.figuraCarta = figuraCarta;
	}

	@Override
	public String toString() {
			String textoMostrar = "";
			if (getNumeroCarta() == 0) {
				textoMostrar = getFiguraCarta() + " de " + getPalo();
			} else {
				textoMostrar = getNumeroCarta() + " de " + getPalo();
			}
		
		return textoMostrar;
	}
	
}
