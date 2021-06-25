package com.pokedexapp.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites {

    @JsonProperty("front_default")
    String frontDefault;

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }
}
