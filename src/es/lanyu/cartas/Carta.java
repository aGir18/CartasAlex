package es.lanyu.cartas;

import java.util.Objects;

public class Carta implements Comparable<Carta> {

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
	public int compareTo(Carta cartaComparar) {
		int solucion = 0;
		if (this.getPalo() == cartaComparar.getPalo()) {
			if (this.getNumeroCarta() == 0 && cartaComparar.getNumeroCarta() == 0) {
				if (this.getFiguraCarta() == cartaComparar.getFiguraCarta()) {
					solucion = 0;
				} else if (this.getFiguraCarta() == "Sota") {
					solucion = -1;
				} else if (this.getFiguraCarta() == "Rey") {
					solucion = 1;
				} else if (this.getFiguraCarta() == "Caballo" && cartaComparar.getFiguraCarta() == "Rey") {
					solucion = -1;
				} else if (this.getFiguraCarta() == "Caballo" && cartaComparar.getFiguraCarta() == "Sota") {
					solucion = 1;
				}		
				
			} else {
				if (this.getNumeroCarta() == cartaComparar.getNumeroCarta()) {
					solucion = 0;
				} else if (this.getNumeroCarta() < cartaComparar.getNumeroCarta()) {
					solucion = -1;
				} else {
					solucion = 1;
				}
				}
		} else if (this.getPalo() == "BASTOS") {
			solucion = -1;
		} else if (this.getPalo() == "COPAS" && cartaComparar.getPalo() == "BASTOS") {
			solucion = 1;
		} else if(this.getPalo() == "COPAS" && cartaComparar.getPalo() != "BASTOS") {
			solucion = -1;
		} else if(this.getPalo() == "ESPADAS" && cartaComparar.getPalo() == "OROS") {
			solucion = -1;
		} else if(this.getPalo() == "ESPADAS" && cartaComparar.getPalo() != "OROS") {
			solucion = 1;
		}
		
		return solucion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(figuraCarta, numeroCarta, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(figuraCarta, other.figuraCarta) && numeroCarta == other.numeroCarta
				&& Objects.equals(palo, other.palo);
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
