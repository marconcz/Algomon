package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueDeFuego extends Ataque{
	
	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueDeFuego(this);
	}

}
