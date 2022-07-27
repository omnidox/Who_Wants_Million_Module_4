package com.example.who_wants_million_module_4;

import java.util.ArrayList;
import java.util.List;

//here we populate our questionlist with questions, their relevant answers, and user supplied answers.

public class QuestionsBank {

    private static List<QuestionsList> quizQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create objects of QuestionList with questions, options, correct answer, and user supplied answer.

        //used trivia questions from the following site: https://www.ultimatequizquestions.com/multiple-choice-trivia-questions/



        String q1 = "In the \"Road Runner and Coyote\" cartoons, what famous sound does the Road Runner make?";

        String q1_O1 = "Ping! Ping!";
        String q1_O2 = "Beep! Beep!";//Right
        String q1_O3 = "Aooga! Aooga!";
        String q1_O4 = "Vroom! Vroom!";

        String q2 = "Where should choking victims place their hands to indicate to others that they need help?";

        String q2_O1 = "Over the eyes";
        String q2_O2 = "On the knees";
        String q2_O3 = "Around the throat";//Right
        String q2_O4 = "On the hips";


        String q3 = "Which of these dance names is used to describe a fashionable dot?";

        String q3_O1 = "Hora";
        String q3_O2 = "Swing";
        String q3_O3 = "Lambada";
        String q3_O4 = "Polka";//Right

        String q4 = "In what \"language\" would you say \"ello-hay\" to greet your friends?";

        String q4_O1 = "Bull Latin";
        String q4_O2 = "Dog Latin";
        String q4_O3 = "Duck Latin";
        String q4_O4 = "Pig Latin";//Right

        String q5 = "What part of a chicken is commonly called the \"drumstick\"?";

        String q5_O1 = "Breast";
        String q5_O2 = "Wing";
        String q5_O3 = "Leg";//Right
        String q5_O4 = "Gizzard";



        String q6 = "What is the only position on a football team that can be \"sacked\"?";

        String q6_O1 = "Center";
        String q6_O2 = "Wide receiver";
        String q6_O3 = "Tight end";
        String q6_O4 = "Quarterback";//right

        String q7 = "What god of love is often depicted as a chubby winged infant with a bow and arrow?";

        String q7_O1 = "Zeus";
        String q7_O2 = "Mercury";
        String q7_O3 = "Cupid";//right
        String q7_O4 = "Poseidon";


        String q8 = "What Steven Spielberg film climaxes at a place called Devil's Tower?";

        String q8_O1 = "E.T: The Extra-Terrestrial";
        String q8_O2 = "Jurassic Park";
        String q8_O3 = "Raiders of the Lost Ark";
        String q8_O4 = "Close Encounters of the Third Kind";//right

        String q9 = "In what U.S. town did the famous 1881 shoot-out at the O.K. Corral take place?";

        String q9_O1 = "Laramie";
        String q9_O2 = "Tombstone";//right
        String q9_O3 = "El Paso";
        String q9_O4 = "Dodge City";

        String q10 = "Which of the following months has no U.S. federal holiday?";

        String q10_O1 = "August";//right
        String q10_O2 = "February";
        String q10_O3 = "September";
        String q10_O4 = "November";



        String q11 = "What mythological beast is reborn from its own ashes?";

        String q11_O1 = "Phoenix";//right
        String q11_O2 = "Minotaur";
        String q11_O3 = "Dragon";
        String q11_O4 = "Golem";

        String q12 = "Who developed the first effective vaccine against polio?";

        String q12_O1 = "Albert Sabin";
        String q12_O2 = "Niels Bohr";
        String q12_O3 = "Louis Pasteur";
        String q12_O4 = "Jonas Salk";//right


        String q13 = "Which of the following is not a monotheistic religion?";

        String q13_O1 = "Islam";
        String q13_O2 = "Judaism";
        String q13_O3 = "Hinduism";//right
        String q13_O4 = "Christianity";

        String q14 = "What architect designed the glass pyramid in the courtyard of the Louvre?";

        String q14_O1 = "Philip Johnson";
        String q14_O2 = "Le Corbusier";
        String q14_O3 = "Frank Gehry";
        String q14_O4 = "I.M. Pei";//right

        String q15 = "Which of these U.S. Presidents appeared on the television series \"Laugh-In\"?";

        String q15_O1 = "Lyndon Johnson";
        String q15_O2 = "Richard Nixon";//right
        String q15_O3 = "Jimmy Carter";
        String q15_O4 = "Gerald Ford";

        String userAnswer = "";



        final QuestionsList question1 = new QuestionsList(q1,q1_O1,q1_O2,q1_O3,q1_O4,q1_O2,userAnswer);
        final QuestionsList question2 = new QuestionsList(q2,q2_O1,q2_O2,q2_O3,q2_O4,q2_O3,userAnswer);
        final QuestionsList question3 = new QuestionsList(q3,q3_O1,q3_O2,q3_O3,q3_O4,q3_O4,userAnswer);
        final QuestionsList question4 = new QuestionsList(q4,q4_O1,q4_O2,q4_O3,q4_O4,q4_O4,userAnswer);
        final QuestionsList question5 = new QuestionsList(q5,q5_O1,q5_O2,q5_O3,q5_O4,q5_O3,userAnswer);

        final QuestionsList question6 = new QuestionsList(q6,q6_O1,q6_O2,q6_O3,q6_O4,q6_O4,userAnswer);
        final QuestionsList question7 = new QuestionsList(q7,q7_O1,q7_O2,q7_O3,q7_O4,q7_O3,userAnswer);
        final QuestionsList question8 = new QuestionsList(q8,q8_O1,q8_O2,q8_O3,q8_O4,q8_O4,userAnswer);
        final QuestionsList question9 = new QuestionsList(q9,q9_O1,q9_O2,q9_O3,q9_O4,q9_O2,userAnswer);
        final QuestionsList question10 = new QuestionsList(q10,q10_O1,q10_O2,q10_O3,q10_O4,q10_O1,userAnswer);

        final QuestionsList question11 = new QuestionsList(q11,q11_O1,q11_O2,q11_O3,q11_O4,q11_O1,userAnswer);
        final QuestionsList question12 = new QuestionsList(q12,q12_O1,q12_O2,q12_O3,q12_O4,q12_O4,userAnswer);
        final QuestionsList question13 = new QuestionsList(q13,q13_O1,q13_O2,q13_O3,q13_O4,q13_O3,userAnswer);
        final QuestionsList question14 = new QuestionsList(q14,q14_O1,q14_O2,q14_O3,q14_O4,q14_O4,userAnswer);
        final QuestionsList question15 = new QuestionsList(q15,q15_O1,q15_O2,q15_O3,q15_O4,q15_O2,userAnswer);

        //Store QuestionList objects in a list of QuestionList objects called questionLists

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(){
        return quizQuestions();
    }

}
