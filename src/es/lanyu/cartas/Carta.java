package es.lanyu.cartas;

public interface Carta extends Comparable<Carta>{

	int getNumeroCarta();

	String getFiguraCarta();

	String getPalo();

	default int compareTo(Carta cartaComparar) {
		int solucion = 0;
		if (this.getPalo() == cartaComparar.getPalo()) {
			if (this.getNumeroCarta() == 0 && cartaComparar.getNumeroCarta() == 0) {
				if (this.getFiguraCarta() == cartaComparar.getFiguraCarta()) {
					solucion = 0;
				} else if (this.getFiguraCarta() == "As") {
					solucion = -1;
				} else if (this.getFiguraCarta() == "Sota" && cartaComparar.getFiguraCarta() == "Caballo") {
					solucion = -1;
				} else if (this.getFiguraCarta() == "Caballo" && cartaComparar.getFiguraCarta() == "Sota") {
					solucion = 1;
				} else if (this.getFiguraCarta() == "Rey") {
					solucion = 1;
				} else if (cartaComparar.getFiguraCarta() == "Rey") {
					solucion = -1;
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

	
}