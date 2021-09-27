package Accionar;

import ataque.Ataque;
import pokemon.Pokemon;

public class ModoDeAccion {
	
	private Modo comoActuar;
	
	public ModoDeAccion(){
		this.comoActuar = new ModoNormal();
	}

	public void accionar(Ataque unAtaque, Pokemon objetivo) {
		// TODO Auto-generated method stub
		this.comoActuar.accionar(unAtaque, objetivo);//Hace una Accion segun que tipo de Modo es
		this.comoActuar = this.comoActuar.siguienteModo();//Cambia al siguiente Modo
		
	}

	public void inactivoTresTurnos() {
		// TODO Auto-generated method stub
		this.comoActuar = new ModoInactivo3Turnos();
	}


}
