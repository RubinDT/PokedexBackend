package com.pokedexapp.backend.model;

import org.springframework.data.annotation.Id;

public class Pokemon {

    @Id
    private String pokemonId;

    private String name = "";
    private String imageUrl = ""; //let's plan to only get "back_default" from the sprites list


    public Pokemon(){}

    public Pokemon(String name, String imageUrl){
        this.name = name;
        this.imageUrl = imageUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
