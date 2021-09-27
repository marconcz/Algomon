package Accionar;

import ataque.Ataque;
import pokemon.Pokemon;

public class ModoInactivo3Turnos extends Modo{
	
	private Modo siguienteModo;
	
	public ModoInactivo3Turnos(){
		this.siguienteModo = new ModoInactivo2Turnos();
	}

	@Override
	public void accionar(Ataque unAtaque, Pokemon objetivo) {
		//Aca hay que acordarnos de poner el Mensaje de Dormido en el Layout
	}
	
	public Modo siguienteModo(){
		return this.siguienteModo;
	}

}
