package com.example.modul5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PokemonFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var PokemonAdapter: PokemonAdapter
    private lateinit var CPokemon: MutableList<CPokemon>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pokemon, container, false)

        recyclerView = view.findViewById(R.id.recyclerview)

        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager

        CPokemon = mutableListOf()
        CPokemon.add(CPokemon("Bulbasaur",  R.drawable.p1))
        CPokemon.add(CPokemon("Ivysaur",  R.drawable.p2))
        CPokemon.add(CPokemon("Venusaur", R.drawable.p3))
        CPokemon.add(CPokemon("Mega Venusaur", R.drawable.p4))
        CPokemon.add(CPokemon("Gigan Venusaur", R.drawable.p5))
        CPokemon.add(CPokemon("Charmander",  R.drawable.p6))
        CPokemon.add(CPokemon("Charmelon",  R.drawable.p7))
        CPokemon.add(CPokemon("Charizard", R.drawable.p8))
        CPokemon.add(CPokemon("Mega Charizard X", R.drawable.p9))
        CPokemon.add(CPokemon("Mega Charizard Y", R.drawable.p10))
        CPokemon.add(CPokemon("Gigan Charizard",  R.drawable.p11))
        CPokemon.add(CPokemon("Squirtle",  R.drawable.p12))
        CPokemon.add(CPokemon("Wartortle", R.drawable.p13))
        CPokemon.add(CPokemon("Blastoise", R.drawable.p14))
        CPokemon.add(CPokemon("Mega Blastoise", R.drawable.p15))


        PokemonAdapter = PokemonAdapter(CPokemon)
        recyclerView.adapter = PokemonAdapter

        return view
    }
}