package com.example.who_wants_million_module_4;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResults extends AppCompatActivity {
    private ISharedPreference sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        //this is used to get time and date in which test was completed
        String date = (DateFormat.format("MM-dd-yyyy hh:mm:ss", new java.util.Date()).toString());

        sharedPreferences = new SecuredSharePref("MYPREFS", QuizResults.this);

        String userEmail = sharedPreferences.getString("useremail", "no email");
        String password = sharedPreferences.getString("password", "no password");

        final AppCompatButton homePageBtn = findViewById(R.id.backHomePageBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("Final_Money", 0);


        correctAnswer.setText(String.valueOf("$ " + getCorrectAnswers));

        String scoreHistory = sharedPreferences.getString(userEmail + password + "score","");


        //updates the score history in shared preferences
        if (scoreHistory.isEmpty()) {
            sharedPreferences.putString(userEmail + password + "score", "Score: " + String.valueOf(getCorrectAnswers) + " Received on " + date + "\n\n");
        }
        else{
            sharedPreferences.putString(userEmail + password + "score", scoreHistory + "Score: " + String.valueOf(getCorrectAnswers) + " Received on " + date + "\n\n");
        }


        //goes back to homepage
        homePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    //goes back to homepage
    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}