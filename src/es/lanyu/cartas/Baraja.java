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



}
