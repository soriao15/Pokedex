package com.example.omarsoria.pokedex;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PokemonBase {

    private List<Pokemon> mPokemons;
    private static PokemonBase sPokemonBase;

    public static PokemonBase get (Context context){
        if (sPokemonBase == null){
            sPokemonBase = new PokemonBase(context);

        }
        return sPokemonBase;

    }

    private PokemonBase(Context context){
        mPokemons = new ArrayList<>();


        mPokemons.add(new Pokemon("Dragonite", "Dragon Pokemon", "91", "134", "100", "463.0 lbs", "7'03\" ", "95", "100", "80",R.drawable.dragonite ));
        mPokemons.add(new Pokemon( "Gengar", "Shadow Pokemon", "60", "65", "130", "89.3 lbs", "4' 11\"", "60", "75", "110", R.drawable.gengar));
        mPokemons.add(new Pokemon("Hoothoot", "Owl Pokemon", "60","30", "36","46.7 lbs", "2'04\"","30", "56", "50", R.drawable.hoothoot ));
        mPokemons.add(new Pokemon( "Ludicolo","Carefree Pokemon","80","70","90","121.3 lbs","4'11\"","70","100","70", R.drawable.ludicolo));
        mPokemons.add(new Pokemon("Mudkip", "Mud Fish Pokemon", "50", "70", "50", "16.8 lbs", "1'04\" ", "50", "50", "40", R.drawable.mudkip ));
        mPokemons.add(new Pokemon( "Phanpy", "Long Nose Pokemon", "90", "60", "40", "73.9 lbs", "1' 08\"", "60", "40", "40", R.drawable.phanpy));
        mPokemons.add(new Pokemon("Slowpoke", "Dopey Pokemon", "90","65", "40","79.4 lbs", "3'11\"","65", "40", "15", R.drawable.slowpoke ));
        mPokemons.add(new Pokemon( "Snorlax","Sleeping Pokemon","160","110","65","1014.1 lbs","6'11\"","65","110","30",R.drawable.snorlax));
        mPokemons.add(new Pokemon("Sudowoodo", "Imitation Pokemon", "70","100", "30","83.8 lbs", "3'11\"","115", "65", "30",R.drawable.sudowoodo ));
        mPokemons.add(new Pokemon( "Typhlosion","Volcano Pokemon","78","84","109","175.3 lbs","5'07\"","78","85","100",R.drawable.typhlosion));



    }

    public List<Pokemon> getPokemons() {
        return mPokemons;
    }

    public Pokemon getPokemon(UUID id) {
        for (Pokemon pokemon : mPokemons) {
            if (pokemon.getId().equals(id)) {
                return pokemon;
            }

        }
        return null;

    }


}
