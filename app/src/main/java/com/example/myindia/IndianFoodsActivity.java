package com.example.myindia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class IndianFoodsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indian_list);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Biryani", R.drawable.biryani));
        items.add(new Item("Idli", R.drawable.idli));
        items.add(new Item("Gulab jaamun", R.drawable.gulab_jamun));
        items.add(new Item("Chole Bhature", R.drawable.chole_bhature));
        items.add(new Item("Rajma", R.drawable.rajma));
        items.add(new Item("Pani puri", R.drawable.pani_puri));
        items.add(new Item("Jalebi", R.drawable.jalebi));
        items.add(new Item("Tandoori chicken", R.drawable.tandoori_chicken));
        items.add(new Item("Dosa", R.drawable.dosa));
        items.add(new Item("Vada", R.drawable.vada));
        items.add(new Item("Dhokla", R.drawable.dhokla));
        items.add(new Item("Mutar Paneer", R.drawable.mutter_paneer));
        items.add(new Item("Gaajar halwa", R.drawable.gaazar_halwa));
        items.add(new Item("Butter Chicken", R.drawable.butter_chicken));
        items.add(new Item("Naan", R.drawable.naan));
        items.add(new Item("Papri chaat", R.drawable.paapri_chat));
        items.add(new Item("Kulfi", R.drawable.kulfi));
        items.add(new Item("Samosa", R.drawable.samosa));
        items.add(new Item("Litti Chokha", R.drawable.litti_choka));
        items.add(new Item("Fish Curry", R.drawable.fish_curry));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, R.color.category_indian_food);
        ListView listView = findViewById(R.id.indian_list_view);
        listView.setAdapter(itemAdapter);

    }
}
