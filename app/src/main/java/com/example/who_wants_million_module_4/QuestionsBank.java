package com.example.who_wants_million_module_4;

import java.util.ArrayList;
import java.util.List;

//here we populate our questionlist with questions, their relevant answers, and user supplied answers.

public class QuestionsBank {

    private static List<QuestionsList> quizQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create objects of QuestionList with questions, options, correct answer, and user supplied answer.

        //used trivia questions from the following site: https://www.ultimatequizquestions.com/multiple-choice-trivia-questions/



        String q1 = "In which continent are Chile, Argentina and Brazil?";

        String q1O1 = "North America";
        String q1O2 = "South America";
        String q1O3 = "Europe";
        String q1O4 = "Australasia";

        String q2 = "The Mad Hatter and the Cheshire Cat are characters in which famous book?";

        String q2O1 = "Winne-the-Pooh";
        String q2O2 = "Charlotte's Web";
        String q2O3 = "Charlie and the Chocolate Factory";
        String q2O4 = "Alice in Wonderland";


        String q3 = "What measurement scale is used to determine wind speed?";

        String q3O1 = "Beaufort scale";
        String q3O2 = "Richter scale";
        String q3O3 = "Synoptic scale";
        String q3O4 = "Gusting scale";

        String q4 = "What other country, besides the US, uses the US dollar as its official currency?";

        String q4O1 = "Ecuador";
        String q4O2 = "Canada";
        String q4O3 = "Mexico";
        String q4O4 = "United Kingdom";

        String q5 = "The human body is made up of approximately how much water?";

        String q5O1 = "40%";
        String q5O2 = "50%";
        String q5O3 = "60%";
        String q5O4 = "70%";

        String userAnswer = "";



        final QuestionsList question1 = new QuestionsList(q1,q1O1,q1O2,q1O3,q1O4,q1O2,userAnswer);
        final QuestionsList question2 = new QuestionsList(q2,q2O1,q2O2,q2O3,q2O4,q2O4,userAnswer);
        final QuestionsList question3 = new QuestionsList(q3,q3O1,q3O2,q3O3,q3O4,q3O1,userAnswer);
        final QuestionsList question4 = new QuestionsList(q4,q4O1,q4O2,q4O3,q4O4,q4O1,userAnswer);
        final QuestionsList question5 = new QuestionsList(q5,q5O1,q5O2,q5O3,q5O4,q5O3,userAnswer);

        //Store QuestionList objects in a list of QuestionList objects called questionLists

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(){
        return quizQuestions();
    }

}
