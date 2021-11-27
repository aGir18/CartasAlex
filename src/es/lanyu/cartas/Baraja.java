package es.lanyu.cartas;

public class Baraja extends GrupoCartas {

	String[] palosBarajaEspañola = { "OROS", "ESPADAS", "COPAS", "BASTOS" };
	private final int numeroCartasPaloEspañolaSinFiguras = 9;
	private final String numeroUnoEspañola = "As";
	private final String numeroDiezEspañola = "Sota";
	private final String numeroOnceEspañola = "Caballo";
	private final String numeroDoceEspañola = "Rey";

	public void crearBarajaEspañola() {
		for (int i = 0; i < palosBarajaEspañola.length; i++) {
			this.getCartasEnBaraja().add(new Carta(palosBarajaEspañola[i], numeroUnoEspañola));
			for (int j = 2; j <= numeroCartasPaloEspañolaSinFiguras; j++) {
				this.getCartasEnBaraja().add(new Carta(palosBarajaEspañola[i], j));
			}
			this.getCartasEnBaraja().add(new Carta(palosBarajaEspañola[i], numeroDiezEspañola));
			this.getCartasEnBaraja().add(new Carta(palosBarajaEspañola[i], numeroOnceEspañola));
			this.getCartasEnBaraja().add(new Carta(palosBarajaEspañola[i], numeroDoceEspañola));
		}
	}

	private Carta robar(Carta cartaRobar) {
		Carta cartaDevuelta = null;
		if (getCartasEnBaraja().isEmpty()) {
			cartaDevuelta = null;
		} else {
			if (getCartasEnBaraja().contains(cartaRobar)) {
				cartaDevuelta = cartaRobar;
				getCartasEnBaraja().remove(cartaRobar);
			} else if (getCartasEnBaraja().contains(cartaRobar) == false){
				cartaDevuelta = null;
			} else if (cartaRobar == null) {
//				cartaDevuelta = getCartasEnBaraja(get(0));
//				Me falta por terminar
			}
		}
					
		return cartaDevuelta;
	}

}
