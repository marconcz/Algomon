package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueDeHierba extends Ataque {

	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueDeHierba(this);
	}

}
