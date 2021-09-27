package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueDeDañoPermanente extends Ataque {

	//Ataques que, cuando impactan, le restan al pokemon oponente x cantidad de puntos de vida. A partir de entonces, el oponente 
	//perdera 10% de sus puntos de vida originales por cada turno.
	
	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueDeDañoPermanente(this);
	}

}

