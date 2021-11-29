package es.lanyu.cartas;

import com.github.cards.Card;

public class CartaExterna extends Card implements Carta {

	public CartaExterna(int suit, int rank) {
		super(suit, rank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNumeroCarta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getFiguraCarta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPalo() {
		// TODO Auto-generated method stub
		return null;
	}

}
