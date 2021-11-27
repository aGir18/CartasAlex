package com.tute;

import es.lanyu.cartas.Baraja;

public class Juego {

	public static void main(String[] args) {
		Baraja barajaEspañola = new Baraja();
		System.out.println(barajaEspañola);
		barajaEspañola.crearBarajaEspañola();
		System.out.println(barajaEspañola);
		System.lineSeparator();
		barajaEspañola.barajar();
		System.out.println(barajaEspañola);
	}

}
