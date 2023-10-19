# Who Wants To Be A Millionaire - Module 4

This repository contains the code for a mobile application that simulates the popular game show "Who Wants to Be a Millionaire?". The application is developed in Java for Android devices.

## Features

1. **Login and Registration**: The application provides a login and registration system. Users can register with their details and then log in to play the game.
2. **Quiz Gameplay**: Users can play a quiz game where they answer multiple-choice questions. The gameplay is similar to the "Who Wants to Be a Millionaire?" game show.
3. **Quiz Results**: After completing the quiz, users can view their results, including the number of questions answered correctly and their final score.
4. **Previous Scores**: Users can view their previous scores from past quiz sessions.
5. **Questions Bank**: The application has a bank of questions that are used in the quiz. These questions are stored and managed within the application.
6. **Splash Page**: A splash page is displayed when the application is launched, providing a brief introduction and a visual appeal to the users.
7. **Winning Page**: If a user successfully answers all the questions, they are redirected to a "Millionaire Win" page, celebrating their victory.
8. **Secured Shared Preferences**: The application uses secured shared preferences to store and manage user data securely.

## Code Structure

- [`MainActivity.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/MainActivity.java): The main activity that launches when the application starts.
- [`LoginRegisterPage.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/LoginRegisterPage.java): Handles the login and registration functionalities.
- [`QuizActivity.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/QuizActivity.java): Manages the quiz gameplay.
- [`QuizResults.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/QuizResults.java): Displays the results after the quiz is completed.
- [`PrevScores.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/PrevScores.java): Shows the previous scores of the user.
- [`RegistrationPage.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/RegistrationPage.java): Manages the user registration process.
- [`ISharedPreference.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/ISharedPreference.java): Interface for shared preferences.
- [`SecuredSharePref.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/SecuredSharePref.java): Implementation of secured shared preferences.
- [`SplashPage.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/SplashPage.java): Displays the splash page when the app is launched.
- [`millionaire_Win.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/millionaire_Win.java): Displays the winning page when a user wins the quiz.
- [`TestActivity.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/TestActivity.java): A test activity for debugging and testing purposes.
- [`QuestionsBank.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/QuestionsBank.java): Contains the bank of questions for the quiz.
- [`QuestionsList.java`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/java/com/example/who_wants_million_module_4/QuestionsList.java): Manages the list of questions.

## Layouts

The application also contains various XML layout files that define the user interface for different activities. These layouts include:

- [`activity_main.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_main.xml): Main activity layout.
- [`activity_quiz.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_quiz.xml): Layout for the quiz gameplay.
- [`activity_quiz_results.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_quiz_results.xml): Layout for displaying quiz results.
- [`activity_prev_scores.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_prev_scores.xml): Layout for showing previous scores.
- [`activity_registration_page.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_registration_page.xml): Layout for the registration page.
- [`activity_login_register_page.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_login_register_page.xml): Layout for the login and registration page.
- [`activity_splash_page.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_splash_page.xml): Layout for the splash page.
- [`activity_millionaire_win.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_millionaire_win.xml): Layout for the winning page.
- [`activity_test.xml`](https://github.com/omnidox/Who_Wants_Million_Module_4/blob/master/app/src/main/res/layout/activity_test.xml): Layout for the test activity.

## Conclusion

This application provides an interactive and fun way for users to test their knowledge through a quiz game. With features like login, registration, secured data storage, and an engaging gameplay experience, it offers a comprehensive quiz game experience similar to the "Who Wants to Be a Millionaire?" game show.
