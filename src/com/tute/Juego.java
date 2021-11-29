package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.CartaImpl;
import es.lanyu.cartas.Mano;

public class Juego {

	public static void main(String[] args) {
		Baraja barajaEspañola = new Baraja();
		barajaEspañola.crearBarajaEspañola();
//		System.out.println(barajaEspañola);
		System.lineSeparator();
//		barajaEspañola.barajar();
//		System.out.println(barajaEspañola);
		CartaImpl asBastos = new CartaImpl("BASTOS", "As");
		CartaImpl caballoEspadas = new CartaImpl("ESPADAS", "Caballo");
		CartaImpl seisCopas = new CartaImpl("COPAS", 6);
		CartaImpl cincoCopas = new CartaImpl("COPAS", 5);
		CartaImpl cuatroCopas = new CartaImpl("COPAS", 4);
		Carta tresCopas = new CartaImpl("COPAS", 3);
		Carta reyOros = new CartaImpl("OROS", "Rey");

		Mano mano01 = new Mano();
		mano01.getCartasEnBaraja().add(asBastos);
		mano01.getCartasEnBaraja().add(caballoEspadas);
		mano01.getCartasEnBaraja().add(cuatroCopas);
		mano01.getCartasEnBaraja().add(seisCopas);
		mano01.getCartasEnBaraja().add(cincoCopas);
		
		System.out.println(mano01);
		System.out.println("¿Está dentro el 5 de copas? " + mano01.estaDentro(cincoCopas));
		System.out.println("¿Está dentro el 6 de copas? " + mano01.estaDentro(seisCopas));
		mano01.robarCarta(seisCopas);
		mano01.robarCarta(asBastos);
		mano01.robarCarta(caballoEspadas);
		mano01.robarCarta(cuatroCopas);
		System.out.println("Tras robar 4 cartas queda así: ");
		System.lineSeparator();
		System.out.println(mano01);
		System.out.println("¿Está dentro el 5 de copas? " + mano01.estaDentro(cincoCopas));
		System.out.println("¿Está dentro el 6 de copas? " + mano01.estaDentro(seisCopas));
		System.out.println(mano01.robarCarta(null));

		System.lineSeparator();
		System.out.println(barajaEspañola);
		barajaEspañola.barajar();
		System.out.println(barajaEspañola);
		barajaEspañola.ordenar();
		System.out.println(barajaEspañola);
		
//		System.out.println(barajaEspañola.estaDentro(cincoCopas));
//		System.out.println(mano01.estaDentro(reyOros));
//		System.out.println(asBastos.compareTo(reyOros));
//		System.out.println(cuatroCopas.compareTo(asBastos));
//		System.out.println(seisCopas.compareTo(seisCopas));
//		System.out.println(seisCopas.compareTo(cincoCopas));
	}
}
