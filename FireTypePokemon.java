package pokemon;

import ataque.Ataque;
import excepciones.PokemonSeDebilitoException;

public abstract class FireTypePokemon extends Pokemon{

	public void recibirAtaqueDeFuego(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.noMuyEfectivo(unAtaque);;
	}

	public void recibirAtaqueDeAgua(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.superEfectivo(unAtaque);
	}

	public void recibirAtaqueDeHierba(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.noMuyEfectivo(unAtaque);
	}
}
