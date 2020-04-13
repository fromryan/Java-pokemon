package com.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons;
	
	public Pokedex() {
		this.myPokemons = new ArrayList<Pokemon>();
	}
	
	public void listPokemon() {
		for(Pokemon pokemon: myPokemons) {
			System.out.println(pokemon.getName());
		}
	}

	public String PokemonInfo(Pokemon pokemon) {
		return null;
	}
}
