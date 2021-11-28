package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.Mano;

public class Juego {

	public static void main(String[] args) {
		Baraja barajaEspañola = new Baraja();
		barajaEspañola.crearBarajaEspañola();
//		System.out.println(barajaEspañola);
		System.lineSeparator();
//		barajaEspañola.barajar();
//		System.out.println(barajaEspañola);
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
		System.out.println(mano01);
		mano01.barajar();
		System.out.println(mano01);

		System.out.println(mano01.estaDentro(tresCopas));
		System.out.println(mano01.estaDentro(asBastos));
		System.out.println(barajaEspañola.getCartasEnBaraja().get(47));
		System.out.println(barajaEspañola.estaDentro(reyOros));
		barajaEspañola.robarCarta(reyOros);
		System.out.println(barajaEspañola.estaDentro(reyOros));
		//NO ME FUNCIONA BIEN
		
		System.out.println(mano01.estaDentro(seisCopas));
		mano01.robarCarta(seisCopas);
		System.out.println(mano01.estaDentro(seisCopas));

//		System.out.println(barajaEspañola.estaDentro(reyOros));
//		System.lineSeparator();
//		barajaEspañola.robar(reyOros);
//		System.out.println(barajaEspañola.estaDentro(reyOros));

//		
//		System.out.println(barajaEspañola.estaDentro(cincoCopas));
//		System.out.println(mano01.estaDentro(reyOros));
//		System.out.println(asBastos.compareTo(reyOros));
//		System.out.println(cuatroCopas.compareTo(asBastos));
//		System.out.println(seisCopas.compareTo(seisCopas));
//		System.out.println(seisCopas.compareTo(cincoCopas));
	}
}
