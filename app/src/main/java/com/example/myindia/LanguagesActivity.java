package com.example.myindia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LanguagesActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indian_list);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Assamese/Asomiya"));
        items.add(new Item("Bengali/Bangla"));
        items.add(new Item("Bodo"));
        items.add(new Item("Dogri"));
        items.add(new Item("Gujarati"));
        items.add(new Item("Hindi"));
        items.add(new Item("Kannada"));
        items.add(new Item("Kashmiri"));
        items.add(new Item("Konkani"));
        items.add(new Item("Maithili"));
        items.add(new Item("Malayalam"));
        items.add(new Item("Manipuri/Meitei/Meithei"));
        items.add(new Item("Marathi"));
        items.add(new Item("Nepali"));
        items.add(new Item("Oriya"));
        items.add(new Item("Punjabi"));
        items.add(new Item("Sanskrit"));
        items.add(new Item("Santhali"));
        items.add(new Item("Sindhi"));
        items.add(new Item("Tamil"));
        items.add(new Item("Telugu"));
        items.add(new Item("Urdu"));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, R.color.category_languages);
        ListView listView = findViewById(R.id.indian_list_view);
        listView.setAdapter(itemAdapter);
    }
}
