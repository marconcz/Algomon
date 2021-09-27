package Accionar;

import ataque.Ataque;
import pokemon.Pokemon;

public interface Accionable {
	
	public void accionar(Ataque unAtaque, Pokemon objetivo);

	public Accionable siguienteModo();

}
