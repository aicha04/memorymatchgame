package com.example.memorymatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GridSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_selection);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("difficulty");
            //The key argument here must match that used in the other activity
            System.out.println(value);
        }
    }
}