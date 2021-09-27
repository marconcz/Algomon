package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public class Canto extends AtaqueInhabilitante{
	
	public Canto(){
		this.potencia = 0;
		this.cantidad = 6;
	}
	
	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		objetivo.recibirAtaqueCanto();
	}




}
