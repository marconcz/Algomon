package Accionar;

import ataque.Ataque;
import excepciones.NoPuedeRealizarElAtaqueException;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public class ModoNormal extends Modo implements Accionable {
	
	

	
	public void accionar(Ataque unAtaque, Pokemon objetivo) {
		// TODO Auto-generated method stub
		try {
			unAtaque.ejecutarContra(objetivo);
		} catch (NoPuedeRealizarElAtaqueException e) {
			return; //El ataque no se ejecut�
		} catch (PokemonSeDebilitoException e) {
			// El pokemon que recibi� el ataque se qued� sin puntos de vida.
		}
		unAtaque.decrementarCantidad();
	}
		
	public Modo siguienteModo(){
		return this;
	}
}


