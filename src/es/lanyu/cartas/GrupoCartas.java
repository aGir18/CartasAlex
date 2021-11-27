package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GrupoCartas {

	private Collection<Carta> cartas = new ArrayList<>();

	public GrupoCartas() {
		super();
	}

	public Collection<Carta> getCartasEnBaraja() {
		return cartas;
	}

	public void barajar() {
		Collections.shuffle((List<?>) cartas);
	}
	
	public boolean estaDentro(Carta cartaComprobar) {
		boolean respuesta = false;
		for (Carta carta : cartas) {
			if (cartaComprobar.getPalo() == carta.getPalo() && cartaComprobar.getNumeroCarta() == carta.getNumeroCarta()) {
				respuesta = true;
				break;
			} else if (cartaComprobar.getPalo() == carta.getPalo() && cartaComprobar.getFiguraCarta() == carta.getFiguraCarta()){
				respuesta = true;
				break;
			} else {
				respuesta = false;
			}
		}
				
		return respuesta;  
	}

	public String toString() {
		String valorFinal = "";
		for (Carta carta : getCartasEnBaraja()) {
			valorFinal += carta.toString() + "\n";
		}

		return valorFinal;
	}
	
	
}