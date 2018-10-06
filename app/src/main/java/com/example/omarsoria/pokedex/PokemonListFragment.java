package com.example.omarsoria.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PokemonListFragment extends Fragment {
    private RecyclerView mPokemonRecyclerView;
    private PokemonAdapter mAdapter;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =

                inflater.inflate(R.layout.fragment_pokemon_list, container, false);

        mPokemonRecyclerView = (RecyclerView) view.findViewById(R.id.pokemon_recycler_view);
        mPokemonRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {

        PokemonBase pokebase = PokemonBase.get(getActivity());
        List<Pokemon> pokemons = pokebase.getPokemons();

        if (mAdapter == null) {
            mAdapter = new PokemonAdapter(pokemons);
            mPokemonRecyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }


    }

    private class PokemonHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mTitleTextView;
        private ImageView mPokemonImageView;

        private Pokemon mPokemon;


        public PokemonHolder(LayoutInflater inflater, ViewGroup parent)

        {
            super(inflater.inflate(R.layout.list_item_pokemon, parent, false));
            itemView.setOnClickListener(this);
            mTitleTextView = (TextView) itemView.findViewById(R.id.pokemon_title);
            mPokemonImageView = (ImageView) itemView.findViewById(R.id.imageView);

        }


        public void onClick(View view)

        {
            Intent intent =
                    PokeActivity.newIntent(getActivity(), mPokemon.getId());
            startActivity(intent);
        }


        public void bind(Pokemon pokemon)
        {
            mPokemon = pokemon;
            mTitleTextView.setText(mPokemon.getName());
            mPokemonImageView.setImageResource(mPokemon.getImage());
        }
    }


    private class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {

        private List<Pokemon> mPokemons;


        public PokemonAdapter(List<Pokemon> pokemons) {
            mPokemons = pokemons;
        }


        @Override
        public PokemonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater =

                    LayoutInflater.from(getActivity());

            return new PokemonHolder(layoutInflater,

                    parent);

        }

        @Override
        public void onBindViewHolder(PokemonHolder holder, int position) {


            Pokemon pokemon = mPokemons.get(position);
            holder.bind(pokemon);

        }

        @Override
        public int getItemCount() {
            return mPokemons.size();

        }
    }
}



