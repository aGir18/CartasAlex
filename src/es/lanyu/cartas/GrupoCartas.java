package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GrupoCartas {

	protected Collection<Carta> cartas = new ArrayList<>();

	public GrupoCartas() {
		super();
	}

	protected Collection<Carta> getCartasEnBaraja() {
		return cartas;
	}

	public void barajar() {
		Collections.shuffle((List<?>) cartas);
	}

}