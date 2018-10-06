package com.example.omarsoria.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class PokeActivity extends SingleFragmentActivity
{
    @Override    protected Fragment createFragment()
    {
        UUID crimeId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_POKEMON_ID);
        return PokemonFragment.newInstance(crimeId);
    }
    private static final String EXTRA_POKEMON_ID =
            "com.example.omarsoria.pokedex.pokemon_id";
    public static Intent newIntent(Context packageContext, UUID pokemonId) {
        Intent intent = new Intent(packageContext, PokeActivity.class);
        intent.putExtra(EXTRA_POKEMON_ID, pokemonId);

    return intent;
    }
}

