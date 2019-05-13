package com.example.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PuzzleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        final Button easy = findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PuzzleActivity.this, EasyActivity.class);
                startActivity(i);
            }
        });

        final Button hard = findViewById(R.id.hard);
        hard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PuzzleActivity.this, HardActivity.class);
                startActivity(i);
            }
        });

    }
}
