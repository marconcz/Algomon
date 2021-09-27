package entrenador;
import java.util.LinkedList;

import ataque.Ataque;
import elemento.Elemento;
import excepciones.EquipoCompletoException;
import pokemon.Pokemon;

public class Entrenador {
	
	private LinkedList <Pokemon> equipoPokemon;

	public Entrenador(){
		this.equipoPokemon = new LinkedList<Pokemon>();
	}
	
	public void agregarPokemonAlEquipo(Pokemon unPokemon) throws EquipoCompletoException{
		if (equipoPokemon.size() == 3)
			throw new EquipoCompletoException();
		equipoPokemon.addLast(unPokemon);
	}

	public void darOrdenDeAtaque(Ataque unAtaque, Pokemon unPokemon){
		equipoPokemon.peek().atacar(unAtaque, unPokemon); //La orden va siempre para el pkmn que este primero en el equipo
	}
	
	public void usarElementoEn (Elemento unElemento, Pokemon unPokemon){
		unElemento.aplicarEn(unPokemon);
	}
	
	public void pedirCambio (){
		//Falta implementar
	}

	

}
