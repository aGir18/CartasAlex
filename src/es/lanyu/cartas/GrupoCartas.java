package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrupoCartas {

	private List<CartaImpl> cartas = new ArrayList<>();

	public GrupoCartas() {
		super();
	}

	public List<CartaImpl> getCartasEnBaraja() {
		return cartas;
	}

	public void barajar() {
		Collections.shuffle((List<?>) cartas);
	}
	
	public boolean estaDentro(Carta cartaComprobar) {
		boolean respuesta = false;
		for (Carta carta : getCartasEnBaraja()) {
			if (carta.equals(cartaComprobar)) {
				respuesta = true;
				break;
			}
		}
		
		return respuesta;
	}
	
	public Carta robarCarta(Carta cartaRobar) {
		Carta encontrada = null;
		int primeraPosicion = 0;
		if (cartaRobar == null && getCartasEnBaraja().size() > 0) {
			encontrada = getCartasEnBaraja().get(primeraPosicion);
		}
		for (Carta carta : getCartasEnBaraja()) {
			if (carta.equals(cartaRobar)) {
				encontrada = carta;
				break;
			}
		}
		getCartasEnBaraja().remove(encontrada);
		
		return encontrada;
	}
	
	public void ordenar() {
		cartas.sort(null);
	}

	public String toString() {
		String valorFinal = "";
		for (Carta carta : getCartasEnBaraja()) {
			valorFinal += carta.toString() + "\n";
		}

		return valorFinal;
	}
}
