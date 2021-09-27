package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueInhabilitante extends Ataque {

	//Ataques que impiden al oponente moverse durante los turnos siguientes. Ej: canto, parálisis, atracción, etc
	
	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueInhabilitante(this);
	}
}
