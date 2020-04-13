package com.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type);
	String PokemonInfo(Pokemon pokemon);
	void listPokemon();
}
