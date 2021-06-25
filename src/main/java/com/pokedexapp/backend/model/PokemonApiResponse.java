package com.pokedexapp.backend.model;


public class PokemonApiResponse {

    String name;

    Sprites sprites;

    int order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
