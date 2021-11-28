package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrupoCartas {

	private List<Carta> cartas = new ArrayList<>();

	public GrupoCartas() {
		super();
	}

	public List<Carta> getCartasEnBaraja() {
		return cartas;
	}

	public void barajar() {
		Collections.shuffle((List<?>) cartas);
	}
	
	public boolean estaDentro(Carta cartaComprobar) {
		boolean respuesta = false;
		for (Carta carta : getCartasEnBaraja()) {
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
	
	public Carta robarCarta(Carta cartaRobar) {
		Carta encontrada = null;
		for (Carta carta : getCartasEnBaraja()) {
			if (carta.equals(cartaRobar)) {
				encontrada = carta;
				getCartasEnBaraja().remove(carta);
				break;
			}
		}
		
		return encontrada;
	}

	public String toString() {
		String valorFinal = "";
		for (Carta carta : getCartasEnBaraja()) {
			valorFinal += carta.toString() + "\n";
		}

		return valorFinal;
	}
}



//public Carta robar(Carta cartaRobar) {
//Carta cartaDevuelta = null;
//if (getCartasEnBaraja().isEmpty()) {
//	cartaDevuelta = null;
//} else {
//	if (getCartasEnBaraja().contains(cartaRobar)) {
//		cartaDevuelta = cartaRobar;
//		getCartasEnBaraja().remove(cartaRobar);
//	} else if (getCartasEnBaraja().contains(cartaRobar) == false){
//		cartaDevuelta = null;
//	} else if (cartaRobar == null) {
////		cartaDevuelta = getCartasEnBaraja(get(0));
////		Me falta por terminar
//	}
//}
//			
//return cartaDevuelta;
//}


