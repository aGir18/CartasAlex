package es.lanyu.cartas;

import com.github.cards.Card;

public class CartaExterna extends Card implements Carta {

	public CartaExterna(int suit, int rank) {
		super(suit, rank);
	}

	@Override
	public int getNumeroCarta() {
		return 0;
	}

	@Override
	public String getFiguraCarta() {
		return null;
	}

	@Override
	public String getPalo() {
		return null;
	}
}
