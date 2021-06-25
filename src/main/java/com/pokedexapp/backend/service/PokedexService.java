package com.pokedexapp.backend.service;


import com.pokedexapp.backend.model.Pokemon;
import com.pokedexapp.backend.model.PokemonApiResponse;
import com.pokedexapp.backend.repository.PokedexRepository;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {


    private PokedexRepository pokedexRepository; //let Spring do the instantiation
    private RestTemplate restTemplate;

    public PokedexService(PokedexRepository pokedexRepository){
        this.pokedexRepository = pokedexRepository;
        this.restTemplate = new RestTemplate();
    }

    public String returnPokemonName(String name){
        return(name);
    }

    public PokemonApiResponse getPokemonData(String name){
        System.out.println(name);
        String pokeApiBaseUrl = "https://pokeapi.co/api/v2/pokemon/"+name;
        System.out.println(pokeApiBaseUrl);
        URI uri;
        System.out.println("uri instantiated");
        try {
            uri = new URI(pokeApiBaseUrl);
            System.out.println("uri constructed");
            RequestEntity requestEntity = new RequestEntity(HttpMethod.GET,uri);
            System.out.println("requestEntity intantiated and constructed");
            PokemonApiResponse temp = this.restTemplate.exchange(requestEntity, PokemonApiResponse.class).getBody();
            System.out.println(temp.getName());
            return temp;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


        return(null);
    }
}
