package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueInhabilitante extends Ataque {

	//Ataques que impiden al oponente moverse durante los turnos siguientes. Ej: canto, par�lisis, atracci�n, etc
	
	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueInhabilitante(this);
	}
}
