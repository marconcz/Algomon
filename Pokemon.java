package pokemon;

import Accionar.ModoDeAccion;
import ataque.Ataque;
//import entrenador.Entrenador;
import excepciones.PokemonSeDebilitoException;

public abstract class Pokemon {

	protected double HP;
	protected double HPMax;
	protected ModoDeAccion accionador;
	private boolean inhabilitado;
	private boolean dañoPermanente;
	

	
	public Pokemon(){
		this.inhabilitado = false;
		this.dañoPermanente = false;
		this.HP = HPMax;
		this.accionador = new ModoDeAccion();
	}
	
	public double getHP(){
		return this.HP;
	}
	
	public boolean sufreDañoPermanente(){
		return this.dañoPermanente;
	}
	
	
	public boolean estaInhabilitado(){
		return this.inhabilitado;
	}
	
	public void atacar(Ataque unAtaque, Pokemon objetivo){
		this.accionador.accionar(unAtaque,objetivo);
	}
	
	
	public void recibirAtaqueDeFuego(Ataque unAtaque) throws PokemonSeDebilitoException{ //A diferencia del piedra-papel-tijera, hace falta pasar el ataque por parametro, porque no todos hacen el mismo da�o
		this.dañoNormal(unAtaque);
	} 
	
	public void recibirAtaqueInhabilitante(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.inhabilitado = true;
	}
	
	public void recibirAtaqueDeDañoPermanente(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.dañoNormal(unAtaque);
		this.dañoPermanente = true;
	}
	
	public void recibirAtaqueDeAgua(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.dañoNormal(unAtaque);
	}
	
	public void recibirAtaqueDeHierba(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.dañoNormal(unAtaque);
	}
	
	public void recibirAtaqueNormal(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.dañoNormal(unAtaque);
	} 
	
	public void recibirAtaqueEspecial(Ataque unAtaque){} //Este lo usamos para los ataques que ateran el estado del pkmn, como el canto de Jigglypuff.

	
	public void dañoNormal(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.decrementarHP(unAtaque.getPotencia());
	}

	public void superEfectivo(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.decrementarHP(2 * unAtaque.getPotencia());
	}

	public void noMuyEfectivo(Ataque unAtaque) throws PokemonSeDebilitoException{
		this.decrementarHP( unAtaque.getPotencia() / 2 );
	}
	
	public void decrementarHP(double cantidad){
		this.HP -= cantidad;
		//if (this.HP <= 0)
			//this.entrenador.pedirCambio();
	}

	public void aumentarHP (double cantidad){
		//falta implementar
	}

	public void recibirAtaqueCanto() {
		// TODO Auto-generated method stub
		this.accionador.inactivoTresTurnos(); 
	}


}
