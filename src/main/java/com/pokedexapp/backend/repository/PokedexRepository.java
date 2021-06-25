package com.pokedexapp.backend.repository;

import com.pokedexapp.backend.model.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokedexRepository extends MongoRepository<Pokemon, String> {

    public Pokemon findByName(String name);
    public Pokemon findByPokemonId(String id);

}
