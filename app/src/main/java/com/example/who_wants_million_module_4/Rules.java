package com.example.who_wants_million_module_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rules extends AppCompatActivity {


    //Simple Rules Page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        Button btnPlay = (Button) findViewById(R.id.chipPlay2);
        Button btnHomePage = (Button) findViewById(R.id.chipHomePage);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rules.this, QuizActivity.class );
                startActivity(intent);
                finish();
            }
        });

        btnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rules.this, MainActivity.class );
                startActivity(intent);
                finish();
            }
        });
    }
}