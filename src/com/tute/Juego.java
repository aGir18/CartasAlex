package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.Mano;

public class Juego {

	public static void main(String[] args) {
		Baraja barajaEspañola = new Baraja();
		System.out.println(barajaEspañola);
		barajaEspañola.crearBarajaEspañola();
		System.lineSeparator();
		barajaEspañola.barajar();
		Carta asBastos = new Carta("BASTOS", "As");
		Carta caballoEspadas = new Carta("ESPADAS", "Caballo");
		Carta seisCopas = new Carta("COPAS", 6);
		Carta cincoCopas = new Carta("COPAS", 5);
		Carta cuatroCopas = new Carta("COPAS", 4);
		Carta tresCopas = new Carta("COPAS", 3);
		Carta reyOros = new Carta("OROS", "Rey");

		Mano mano01 = new Mano();
		mano01.getCartasEnBaraja().add(asBastos);
		mano01.getCartasEnBaraja().add(caballoEspadas);
		mano01.getCartasEnBaraja().add(cuatroCopas);
		mano01.getCartasEnBaraja().add(seisCopas);
		mano01.getCartasEnBaraja().add(cincoCopas);
		
		System.out.println(barajaEspañola.estaDentro(cincoCopas));
		System.out.println(mano01.estaDentro(reyOros));
		System.out.println(asBastos.compareTo(reyOros));
		System.out.println(cuatroCopas.compareTo(asBastos));
		System.out.println(seisCopas.compareTo(seisCopas));
		System.out.println(seisCopas.compareTo(cincoCopas));

	}

}
