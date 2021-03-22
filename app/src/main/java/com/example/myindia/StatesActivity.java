package com.example.myindia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StatesActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indian_list);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Andhra Pradesh",R.drawable.andhra_pradesh));
        items.add(new Item("Arunachal Pradesh",R.drawable.arunachal_pradesh));
        items.add(new Item("Assam",R.drawable.assam));
        items.add(new Item("Bihar",R.drawable.bihar));
        items.add(new Item("Chhattisgarh",R.drawable.chhattisgarh));
        items.add(new Item("Goa",R.drawable.goa));
        items.add(new Item("Gujarat",R.drawable.gujarat));
        items.add(new Item("Haryana",R.drawable.haryana));
        items.add(new Item("Himachal Pradesh",R.drawable.himachal_pradesh));
        items.add(new Item("Jharkhand",R.drawable.jharkhand));
        items.add(new Item("Karnataka",R.drawable.karnataka));
        items.add(new Item("Kerala",R.drawable.kerala));
        items.add(new Item("Madhya Pradesh",R.drawable.madhya_pradesh));
        items.add(new Item("Maharashtra",R.drawable.maharashtra));
        items.add(new Item("Manipur",R.drawable.manipur));
        items.add(new Item("Meghalaya",R.drawable.meghalaya));
        items.add(new Item("Mizoram",R.drawable.mizoram));
        items.add(new Item("Nagaland",R.drawable.nagaland));
        items.add(new Item("Odisha",R.drawable.oddisha));
        items.add(new Item("Punjab",R.drawable.punjab));
        items.add(new Item("Rajasthan",R.drawable.rajasthan));
        items.add(new Item("Sikkim",R.drawable.sikkim));
        items.add(new Item("Tamil Nadu",R.drawable.tamil_nadu));
        items.add(new Item("Telangana",R.drawable.telangana));
        items.add(new Item("Tripura",R.drawable.tripura));
        items.add(new Item("Uttar Pradesh",R.drawable.uttar_pradesh));
        items.add(new Item("Uttarakhand",R.drawable.uttarakhand));
        items.add(new Item("West Bengal",R.drawable.west_bengal));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, R.color.category_states);
        ListView listView = findViewById(R.id.indian_list_view);
        listView.setAdapter(itemAdapter);

    }
}
