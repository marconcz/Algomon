package elemento;

import pokemon.Pokemon;

public class Elemento {

	protected int cantidad;
	
	public Elemento(int cantidad){
		this.cantidad = cantidad;
	}
	
	public void aplicarEn(Pokemon unPokemon){};
	
}
