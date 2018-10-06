package com.example.omarsoria.pokedex;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.UUID;

public class PokemonFragment extends Fragment{
    private static final String ARG_POKEMON_ID = "pokemon_id";
    private Pokemon mPokemon;
    private ImageView mPokephoto;
    private TextView mName;
    private TextView mAttack;
    private TextView mHp;
    private TextView mSpAttack;
    private TextView mDefense;
    private TextView mSpdefense;
    private TextView mSpeed;
    private TextView mWeight;
    private TextView mHeight;
    private TextView mCategory;

    public static PokemonFragment newInstance(UUID pokemonId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_POKEMON_ID, pokemonId);
        PokemonFragment fragment = new PokemonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID pokemonId = (UUID) getArguments().getSerializable(ARG_POKEMON_ID);
        mPokemon = PokemonBase.get(getActivity()).getPokemon(pokemonId);

    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v =
                inflater.inflate(R.layout.fragment_pokemon, container,
                        false);

        mName = (TextView)
                v.findViewById(R.id.pokemon_title);
        mName.setText(mPokemon.getName());

       mCategory = (TextView)
        v.findViewById(R.id.pokemon_category);
        mCategory.setText("Category: " +mPokemon.getCategory());

        mAttack = (TextView)
                v.findViewById(R.id.pokemon_attack);
        mAttack.setText("Atk: " + mPokemon.getAttack());

        mSpAttack = (TextView)
                v.findViewById(R.id.pokemon_spattack);
        mSpAttack.setText("SPAtk: "+mPokemon.getSpattack());

        mDefense = (TextView)
                v.findViewById(R.id.pokemon_defense);
        mDefense.setText("Def: "+mPokemon.getDefense());

        mSpdefense = (TextView)
                v.findViewById(R.id.pokemon_spdefense);
        mSpdefense.setText("SpDef: "+mPokemon.getSpdefense());

        mHp = (TextView)
                v.findViewById(R.id.pokemon_hp);
        mHp.setText("HP: "+mPokemon.getHp());

        mSpeed = (TextView)
                v.findViewById(R.id.pokemon_speed);
        mSpeed.setText("Spd: "+mPokemon.getSpeed());

        mHeight = (TextView)
                v.findViewById(R.id.pokemon_height);
        mHeight.setText("Ht: "+mPokemon.getHeight());

        mWeight = (TextView)
                v.findViewById(R.id.pokemon_weight);
        mWeight.setText("Wt: "+mPokemon.getWeight());

        mPokephoto = (ImageView)
                v.findViewById(R.id.imageView2);
        mPokephoto.setImageResource(mPokemon.getImage());

        return v;

        }


        }

