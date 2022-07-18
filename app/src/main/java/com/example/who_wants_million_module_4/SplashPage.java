package com.example.who_wants_million_module_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SplashPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);


        //goes to the splash page when the app opens
        Button btnContinue = findViewById(R.id.clickContinueBtn);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LoginRegister = new Intent(SplashPage.this, LoginRegisterPage.class);
                startActivity(LoginRegister);
            }
        });
    }
}