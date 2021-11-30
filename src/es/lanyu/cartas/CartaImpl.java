package es.lanyu.cartas;

import java.util.Objects;

public class CartaImpl implements Carta {

	private String palo;
	private int numeroCarta;
	private String figuraCarta;

	@Override
	public int getNumeroCarta() {
		return numeroCarta;
	}

	@Override
	public String getFiguraCarta() {
		return figuraCarta;
	}

	@Override
	public String getPalo() {
		return palo;
	}

	public CartaImpl(String palo, int numeroCarta) {
		this.palo = palo;
		this.numeroCarta = numeroCarta;
	}

	public CartaImpl(String palo, String figuraCarta) {
		this.palo = palo;
		this.figuraCarta = figuraCarta;
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
		CartaImpl other = (CartaImpl) obj;
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
