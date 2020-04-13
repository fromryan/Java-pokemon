package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		return pokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		String info = "Pokemon name: " + pokemon.getName() + "Pokemon health: " + pokemon.getHealth() + "Pokemon type: " + pokemon.getType();
		return info;
	}
}
