package com.pokedexapp.backend.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class CustomMongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "CCRepository";
    }

    @Override
    public boolean autoIndexCreation() {
        return true;
    }

    // your other configuration
}
