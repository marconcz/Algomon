package Accionar;

import ataque.Ataque;
import pokemon.Pokemon;

public class ModoInactivo1Turno extends Modo {
	
	private Modo siguienteModo;
	
	public ModoInactivo1Turno(){
		this.siguienteModo = new ModoNormal();
	}

	@Override
	public void accionar(Ataque unAtaque, Pokemon objetivo) {
		//Aca hay que acordarnos de poner el Mensaje de Dormido en el Layout
	}
	
	public Modo siguienteModo(){
		return this.siguienteModo;
	}

}
