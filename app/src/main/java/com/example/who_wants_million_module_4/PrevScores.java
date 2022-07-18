package com.example.who_wants_million_module_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrevScores extends AppCompatActivity {

    private ISharedPreference sharedPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_scores);

        TextView userHistoryView = findViewById(R.id.scoresText);
        Button homePagebtn = findViewById(R.id.chipHomePage2);
        Button clearHistoryBtn= findViewById(R.id.chipClearHistory);

        sharedPreference = new SecuredSharePref("MYPREFS", PrevScores.this);

        String userEmail = sharedPreference.getString("useremail", "no email");
        String password = sharedPreference.getString("password", "no password");


        String scoreHistory = sharedPreference.getString(userEmail + password + "score","No History Yet");

        //gets user shared history via shared preferences
        userHistoryView.setText(scoreHistory);


        //goes back to homepage
        homePagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(PrevScores.this, MainActivity.class));
                finish();

            }
        });


        //clears User History
        clearHistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPreference.remove(userEmail + password + "score");

                String clearedScoreHistory = sharedPreference.getString(userEmail + password + "score","No History Yet");

                userHistoryView.setText(clearedScoreHistory);

                startActivity(new Intent(PrevScores.this, PrevScores.class));
                finish();

            }
        });




    }

    public void onBackPressed() {
        startActivity(new Intent(PrevScores.this, MainActivity.class));
        finish();
    }

}