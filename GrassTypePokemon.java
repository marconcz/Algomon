package pokemon;

import ataque.Ataque;
import excepciones.PokemonSeDebilitoException;

public abstract class GrassTypePokemon extends Pokemon {

	public void recibirAtaqueDeFuego(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.superEfectivo(unAtaque);
	}

	public void recibirAtaqueDeAgua(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.noMuyEfectivo(unAtaque);
	}

	public void recibirAtaqueDeHierba(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.noMuyEfectivo(unAtaque);;
	}
}
