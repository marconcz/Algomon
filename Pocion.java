package elemento;

import pokemon.Pokemon;

public class Pocion extends Elemento {

	public Pocion(int cantidad) {
		super(cantidad);
	}

	public void aplicarEn (Pokemon unPokemon){
		unPokemon.aumentarHP(cantidad);
	}


}
