package com.example.who_wants_million_module_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//This will act as the user Homepage. From here the user can see the rules, log out, play the game, and see their score history.
public class MainActivity extends AppCompatActivity {
    private ISharedPreference sharedPreference;
    private TextView userView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userView = findViewById(R.id.textWelcomeUser);
        Button btnPlay = (Button) findViewById(R.id.chipPlay);
        Button btnHigh = (Button) findViewById(R.id.chipHigh);
        Button btnLogOut = (Button) findViewById(R.id.chipLogOut);

        sharedPreference = new SecuredSharePref("MYPREFS", MainActivity.this);


        //gets user info via share preferences
        String userFirstName = sharedPreference.getString("firstname","nofirstnameonmain");
        String userLastName = sharedPreference.getString("lastname","nolastnameonmain");

        //welcomes the user
        userView.setText("Welcome!\n" + userFirstName +" "+ userLastName);


        //Starts the game
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,QuizActivity.class );
                startActivity(intent);
            }
        });

        //Logs the user out
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginRegisterPage.class );
                startActivity(intent);
                finish();
            }
        });



        //Enables the user to see their previous scores
        btnHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrevScores.class );
                startActivity(intent);
            }
        });


    }
    @Override
    //same functionality as the log out button.
    public void onBackPressed() {
        Intent intent = new Intent(MainActivity.this,LoginRegisterPage.class );
        startActivity(intent);
        finish();
    }
}