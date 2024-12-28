package com.example.travelx

import Card1.itemData
import Card1.myAdapter
import Card2.itemData2
import Card2.myAdapter2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerview()
        recyclerview2()
    }

    private fun recyclerview() {
        // Step 1: Initialize RecyclerView
        val recyclerView: RecyclerView = requireView().findViewById(R.id.Recycler)
        recyclerView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )

        // Step 2: Create items
        val items: ArrayList<itemData> = ArrayList()
        items.add(itemData("Adventure", R.drawable.adventure))
        items.add(itemData("Camping", R.drawable.camping))
        items.add(itemData("Beach", R.drawable.beach))
        items.add(itemData("Mountain", R.drawable.mountain))

        // Step 3: Set adapter
        val adapter = myAdapter(items)
        recyclerView.adapter = adapter
    }

    private fun recyclerview2(){
        val recyclerView2: RecyclerView = requireView().findViewById(R.id.Recycler2)
        recyclerView2.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
        // Step 2: Create items
        val items2: ArrayList<itemData2> = ArrayList()
        items2.add(itemData2("Dubai,UAE",R.drawable.dubai_uae,R.drawable.star5))
        items2.add(itemData2("Pamukkale,Turkey", R.drawable.pamukkale_turkey,R.drawable.star5))
        items2.add(itemData2("Paris,France", R.drawable.paris_france,R.drawable.star4))
        items2.add(itemData2("London,England", R.drawable.london_england,R.drawable.star4))
        items2.add(itemData2("Maldives,Maldives", R.drawable.maldives,R.drawable.star3))
        // Step 3: Set adapter
        val adapter2 = myAdapter2(items2)
        recyclerView2.adapter = adapter2
    }
}




