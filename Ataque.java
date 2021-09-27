package ataque;
import excepciones.NoPuedeRealizarElAtaqueException;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class Ataque implements usable{

	protected int potencia;
	protected int cantidad;
	
	public int getPotencia(){
		return this.potencia;
	}

	public void decrementarCantidad(){
		this.cantidad --;
	}
	
	public void ejecutarContra(Pokemon objetivo) throws NoPuedeRealizarElAtaqueException, PokemonSeDebilitoException{          //Pongo este metodo intermedia aca para no tener que poner el mismo if
        if (this.cantidad == 0)                                                                                                //en cada uno de los tipos de ataque
			throw new NoPuedeRealizarElAtaqueException();
		this.realizarAtaqueContra(objetivo);
	}

	protected void realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException {}
}
