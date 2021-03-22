package com.example.myindia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RiversActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indian_list);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("The Ganges", R.drawable.national_river));
        items.add(new Item("Godavari River", R.drawable.godavari_river));
        items.add(new Item("Krishna River", R.drawable.krishna_river));
        items.add(new Item("Narmada River", R.drawable.narmada_river));
        items.add(new Item("Yamuna River", R.drawable.yamuna_river));
        items.add(new Item("Indus River", R.drawable.indus_river));
        items.add(new Item("Brahmaputra River", R.drawable.brahmaputra_river));
        items.add(new Item("Mahanadi River", R.drawable.mahanadi_river));
        items.add(new Item("Kaveri River", R.drawable.kaveri_river));
        items.add(new Item("Tapi River", R.drawable.tapi_river));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, R.color.category_rivers);
        ListView listView = findViewById(R.id.indian_list_view);
        listView.setAdapter(itemAdapter);
    }
}
