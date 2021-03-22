package com.example.myindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Transition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nationalSymbols = (TextView) findViewById(R.id.national_symbol);
        nationalSymbols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent symbolsIntent = new Intent(MainActivity.this, NationalSymbolsActivity.class);
                startActivity(symbolsIntent);
            }
        });

        TextView states = findViewById(R.id.states);
        states.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statesIntent = new Intent(MainActivity.this, StatesActivity.class);
                startActivity(statesIntent);
            }
        });

        TextView monuments = findViewById(R.id.monuments);
        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monumnetsIntent = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(monumnetsIntent);
            }
        });

        TextView languages = findViewById(R.id.languages);
        languages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent languagesIntent = new Intent(MainActivity.this, LanguagesActivity.class);
                startActivity(languagesIntent);
            }
        });

        TextView rivers = findViewById(R.id.rivers);
        rivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent riversIntent = new Intent(MainActivity.this, RiversActivity.class);
                startActivity(riversIntent);
            }
        });

        TextView indianFoods = findViewById(R.id.indian_foods);
        indianFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodsIntent = new Intent(MainActivity.this, IndianFoodsActivity.class);
                startActivity(foodsIntent);
            }
        });
    }
}