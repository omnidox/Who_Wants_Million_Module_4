package com.example.who_wants_million_module_4;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;


//Quiz Activity made with the help of the following tutorial
//https://www.youtube.com/watch?v=vpT0eIUREC0&ab_channel=Learnoset-LearnCodingOnline


public class QuizActivity extends AppCompatActivity {

    private TextView money_Won_Textview;
    private TextView money_Guaranteed_Textview;

    private int currMoneyWon = 0;

    private int finalMoney= 0;

    private final int[] prizeMoneyRange = {100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000, 500000,1000000};

    private TextView questions;
    private TextView question;

    private AppCompatButton option1, option2, option3, option4;

    private AppCompatButton nextBtn;


    private List<QuestionsList> questionsLists;

    private int currentQuestionPosition = 0;

    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backbtn = findViewById(R.id.backBtn);



        money_Won_Textview = findViewById(R.id.money_Won);
        money_Guaranteed_Textview = findViewById(R.id.money_Guaranteed);


        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        nextBtn = findViewById(R.id.nextBtn);


        questionsLists = QuestionsBank.getQuestions();

        questions.setText(prizeMoneyRange[0] + " $ Question");

        money_Won_Textview.setText("" + currMoneyWon);
        money_Guaranteed_Textview.setText("" + finalMoney);


        question.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());



        //when a button is clicked, it will highlight that button, and return other buttons to default color
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//
                if (nextBtn.getText().toString().equals("Lock In Answer")) {
                    selectedOptionByUser = option1.getText().toString();

//                    option1.setBackgroundResource(R.drawable.round_back_red10);
//                    option1.setTextColor(Color.WHITE);
//
//                    revealAnswer();
//
//                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
//
                    option1.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nextBtn.getText().toString().equals("Lock In Answer")) {

                    selectedOptionByUser = option2.getText().toString();

//                    option2.setBackgroundResource(R.drawable.round_back_red10);
//                    option2.setTextColor(Color.WHITE);
//
//                    revealAnswer();
//
//                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);


//                }
                    option2.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nextBtn.getText().toString().equals("Lock In Answer")) {

                    selectedOptionByUser = option3.getText().toString();

//                    option3.setBackgroundResource(R.drawable.round_back_red10);
//                    option3.setTextColor(Color.WHITE);
//
//                    revealAnswer();
//
//                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);


//                }
                    option3.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);

                }
            }
        });


        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nextBtn.getText().toString().equals("Lock In Answer")) {

                    selectedOptionByUser = option4.getText().toString();

//                    option4.setBackgroundResource(R.drawable.round_back_red10);
//                    option4.setTextColor(Color.WHITE);
//
//                    revealAnswer();
//
//                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);


                    option4.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                    option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                }
            }
        });

        //Sets button to lock in answer, and then to finally submit answer.
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {
                    Toast.makeText(QuizActivity.this, "Please Select an Answer Before Proceeding", Toast.LENGTH_SHORT).show();
                } else if (nextBtn.getText().toString().equals("Lock In Answer")) {
                    //Reveals answer once the "lock in answer button is pressed"
                    revealAnswer();
                    if ((currentQuestionPosition + 1) == questionsLists.size()) {
                        nextBtn.setText("Submit Quiz");
                    } else {
                        nextBtn.setText("Next");
                    }
                } else if (nextBtn.getText().toString().equals("Next")||nextBtn.getText().toString().equals("Submit Quiz")) {
                    //updates activity to show the next question
                    changeNextQuestion();
                    if(!nextBtn.getText().toString().equals("Submit Quiz")){
                    nextBtn.setText("Lock In Answer");}


                }
            }
        });

        //Cancels Quiz if back button is clicked
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });
    }


    //a function that changes to the next question
    private void changeNextQuestion() {

        currentQuestionPosition++;



        currMoneyWon = prizeMoneyRange[currentQuestionPosition - 1];

        money_Won_Textview.setText("" + currMoneyWon);

        if (currMoneyWon == 1000 || currMoneyWon == 32000 || currMoneyWon == 1000000){

            finalMoney = currMoneyWon;
        }

        money_Guaranteed_Textview.setText("" + finalMoney);

//        if((currentQuestionPosition+1) == questionsLists.size()){
//            nextBtn.setText("Submit Quiz");
//        }

        if (currentQuestionPosition < questionsLists.size()) {
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((prizeMoneyRange[currentQuestionPosition])  + " $ Question");
            question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
            option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
            option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
            option4.setText(questionsLists.get(currentQuestionPosition).getOption4());


            //here is the code for the winner winner chicken dinner
        } else {

            Intent intent = new Intent(QuizActivity.this, millionaire_Win.class);
            intent.putExtra("Final_Money", finalMoney);

            startActivity(intent);

            finish();
        }


    }



    //function to retrieve the amount of correct answers at the end of the test.
    private int getCorrectAnswers() {

        int correctAnswers = 0;

        for (int i = 0; i < questionsLists.size(); i++) {

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }
        }

        return correctAnswers;
    }


    //function to retrieve the amount of incorrect answers at the end of the test
    private int getInCorrectAnswers() {

        int inCorrectAnswers = 0;

        for (int i = 0; i < questionsLists.size(); i++) {

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)) {
                inCorrectAnswers++;
            }
        }

        return inCorrectAnswers;
    }

    //cancels the test on pressing back button
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    //reveals the correct answer and saves user supplied answer
    private void revealAnswer() {

        final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();

        if (selectedOptionByUser.equals(option1.getText().toString())) {
            option1.setBackgroundResource(R.drawable.round_back_red10);
            option1.setTextColor(Color.WHITE);
        } else if (selectedOptionByUser.equals(option2.getText().toString())) {
            option2.setBackgroundResource(R.drawable.round_back_red10);
            option2.setTextColor(Color.WHITE);
        } else if (selectedOptionByUser.equals(option3.getText().toString())) {
            option3.setBackgroundResource(R.drawable.round_back_red10);
            option3.setTextColor(Color.WHITE);
        } else if (selectedOptionByUser.equals(option4.getText().toString())) {
            option4.setBackgroundResource(R.drawable.round_back_red10);
            option4.setTextColor(Color.WHITE);
        }

        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.round_back_green10);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.round_back_green10);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.round_back_green10);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.round_back_green10);
            option4.setTextColor(Color.WHITE);
        }

        if (!selectedOptionByUser.equals(getAnswer)){

            Intent intent = new Intent(QuizActivity.this, QuizResults.class);
            intent.putExtra("Final_Money", finalMoney);

            startActivity(intent);

            finish();
        }
        questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
    }

}