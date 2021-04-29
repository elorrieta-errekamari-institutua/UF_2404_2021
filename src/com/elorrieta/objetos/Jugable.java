package com.elorrieta.objetos;

public interface Jugable {

	/**
	 * Indica el numero de puntos de vida que quita al atacar
	 * 
	 * @return
	 */
	int atacar();

	/**
	 * @param ataque int la vida que le quitan
	 * @return puntos de vida que le quedan, si <= 0 estas muerto
	 */
	int vida(int ataque);

	/**
	 * 
	 * @return el nombre y la vida que le queda, por ejemplo [100]Jugador1 0
	 *         [12]Jugador2
	 */
	String nombreYvida();

}
