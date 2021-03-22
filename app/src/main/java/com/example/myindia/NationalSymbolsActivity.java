package com.example.myindia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NationalSymbolsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indian_list);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("National Bird: Peacock", R.drawable.national_bird));
        items.add(new Item("National Animal: Tiger", R.drawable.national_animal));
        items.add(new Item("National Anthem: Jana Gana Mana", R.drawable.national_anthem));
        items.add(new Item("National Flower: Lotus", R.drawable.national_flower));
        items.add(new Item("National Fruit: Mango", R.drawable.national_fruit));
        items.add(new Item("National Song: Vande Mataram", R.drawable.national_song));
        items.add(new Item("National Flag: Tricolor", R.drawable.national_flag));
        items.add(new Item("National Game: Hockey", R.drawable.national_game));
        items.add(new Item("National Tree: The Banyan Tree", R.drawable.national_tree));
        items.add(new Item("National Emblem: The Lion Capital of Ashoka", R.drawable.national_emblem));
        items.add(new Item("National River: Ganga", R.drawable.national_river));
        items.add(new Item("National Currency: Indian Rupee", R.drawable.national_currency));
        items.add(new Item("National Heritage Animal: Elephant", R.drawable.national_heritage_animal));
        items.add(new Item("National Aquatic Animal: Dolphin", R.drawable.national_aquatic_animal));
        items.add(new Item("National Reptile: King Cobra", R.drawable.national_reptile));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, R.color.category_national_symbols);
        ListView listView = findViewById(R.id.indian_list_view);
        listView.setAdapter(itemAdapter);
    }
}
