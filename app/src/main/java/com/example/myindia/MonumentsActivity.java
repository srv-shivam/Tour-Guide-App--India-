package com.example.myindia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indian_list);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Taj Mahal, Agra",R.drawable.taj_mahal));
        items.add(new Item("Amber Fort, Jaipur",R.drawable.amber_fort_jaipur));
        items.add(new Item("Golden Temple, Amritsar",R.drawable.golden_temple));
        items.add(new Item("Statue Of Unity, River Narmada",R.drawable.statue_of_unity));
        items.add(new Item("Mehrangarh Fort, Jodhpur",R.drawable.mehrangarh_fort_jodhpur));
        items.add(new Item("Swaminarayan Akshardham Temple, Delhi",R.drawable.akshardham));
        items.add(new Item("Qutab Minar, Delhi",R.drawable.qutub_minar));
        items.add(new Item("Agra Fort, Agra",R.drawable.agra_fort));
        items.add(new Item("Khajuraho Temples, Khajuraho",R.drawable.khajuraho_temples));
        items.add(new Item("Humayun’s Tomb, Delhi",R.drawable.humayun_tomb));
        items.add(new Item("Brihadeeswarar Temple, Thanjavur",R.drawable.brihadeeswarar_temple));
        items.add(new Item("India Gate, New Delhi",R.drawable.india_gate_new_delhi));
        items.add(new Item("Gateway of India, Mumbai",R.drawable.gateway_of_india));
        items.add(new Item("Red Fort, Delhi",R.drawable.red_fort));
        items.add(new Item("Mysore Palace, Mysore",R.drawable.mysore_palace));
        items.add(new Item("Charminar, Hyderabad",R.drawable.charminar_hyderabad));
        items.add(new Item("Meenakshi Amman Temple, Madurai",R.drawable.meenakshi_amman_temple_madurai));
        items.add(new Item("Hawa Mahal, Jaipur",R.drawable.hawa_mahal_jaipur));
        items.add(new Item("Jama Masjid, Delhi",R.drawable.jama_masjid_delhi));
        items.add(new Item("Chhatrapati Shivaji Terminus, Mumbai",R.drawable.chhatrapati_shivaji_terminus_mubai));
        items.add(new Item("Victoria Memorial, Kolkata",R.drawable.victoria_memorial_kolkata));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, R.color.category_monuments);
        ListView listView = findViewById(R.id.indian_list_view);
        listView.setAdapter(itemAdapter);
    }
}
