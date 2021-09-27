package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public class AtaqueNormal extends Ataque{
	
	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueNormal(this);
	}

}
