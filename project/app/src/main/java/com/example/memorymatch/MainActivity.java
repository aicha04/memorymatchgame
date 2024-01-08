package com.example.memorymatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button easyButton = findViewById(R.id.buttonEasy);
        easyButton.setOnClickListener(v -> {
            Intent gridAct = new Intent(MainActivity.this, GridSelectionActivity.class);
            gridAct.putExtra("difficulty","EASY");
            startActivity(gridAct);
            finish();
        });
        Button mediumButton = findViewById(R.id.buttonMedium);
        mediumButton.setOnClickListener(v -> {
            Intent gridAct = new Intent(MainActivity.this, GridSelectionActivity.class);
            gridAct.putExtra("difficulty","MEDIUM");
            startActivity(gridAct);
            finish();
        });
        Button hardButton = findViewById(R.id.buttonHard);
        hardButton.setOnClickListener(v -> {
            Intent gridAct = new Intent(MainActivity.this, GridSelectionActivity.class);
            gridAct.putExtra("difficulty","HARD");
            startActivity(gridAct);
            finish();
        });

    }

}