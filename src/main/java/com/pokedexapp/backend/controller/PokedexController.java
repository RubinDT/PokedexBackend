package com.pokedexapp.backend.controller;


import com.pokedexapp.backend.model.Pokemon;
import com.pokedexapp.backend.model.PokemonApiResponse;
import com.pokedexapp.backend.service.PokedexService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokedexController {
    PokedexService pokedexService; //let Spring do the instantiation

    public PokedexController(PokedexService pokedexService){
        this.pokedexService = pokedexService;
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/lookup/{name}") //plan here is to have a name come in, then 1) send name back to front end to establish connectivity
    public String lookupPokemonData(@PathVariable String name){
        return(this.pokedexService.returnPokemonName(name));
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getdata/{name}")
    public PokemonApiResponse getPokemonData(@PathVariable String name){
        return(this.pokedexService.getPokemonData(name.toLowerCase()));
    }

}
