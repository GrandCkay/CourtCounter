package com.example.android.courtcounter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String finalScore = "Final Score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
    }

    /**
     * Displays the given score for Team A + 3 Point.
     */
    public void ForTeamA3 (View View) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        displayFinalScore (finalScore);
    }
    /**
     * Displays the given score for Team A + 2 Point.
     */
    public void ForTeamA2 (View View) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        displayFinalScore (finalScore);
    }
    /**
     * Displays the given score for Team A Free Throw.
     */
    public void ForTeamA1 (View View) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayFinalScore (finalScore);
    }

    /**
     * Displays the given score for Team B + 3 Point.
     */
    public void ForTeamB3 (View View) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        displayFinalScore (finalScore);
    }
    /**
     * Displays the given score for Team B + 2 Point.
     */
    public void ForTeamB2 (View View) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        displayFinalScore (finalScore);
    }
    /**
     * Displays the given score for Team B Free Throw.
     */
    public void ForTeamB1 (View View) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayFinalScore (finalScore);
    }
    /**
     * Displays the given final score.
     */
    public void FinalScore (View View) {
        EditText editTeamA = findViewById(R.id.editTextTeamA);
        String editTextNameTeamA = editTeamA.getText().toString();
        EditText editTeamB = findViewById(R.id.editTextTeamB);
        String editTextNameTextB = editTeamB.getText().toString();
        String finalScore;
        finalScore = editTextNameTeamA + ": " + scoreTeamA + " - " + scoreTeamB + " :" + editTextNameTextB;
        displayFinalScore (finalScore);
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given final score.
     */
    public void displayFinalScore(String score) {
        TextView scoreView = findViewById(R.id.final_score);
        scoreView.setText("" + (score));
    }


    @Override

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}