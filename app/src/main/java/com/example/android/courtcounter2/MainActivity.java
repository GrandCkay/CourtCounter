package com.example.android.courtcounter2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter2.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A + 3 Point.
     */
    public void ForTeamA3 (View View) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A + 2 Point.
     */
    public void ForTeamA2 (View View) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A Free Throw.
     */
    public void ForTeamA1 (View View) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B + 3 Point.
     */
    public void ForTeamB3 (View View) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B + 2 Point.
     */
    public void ForTeamB2 (View View) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B Free Throw.
     */
    public void ForTeamB1 (View View) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given final score.
     */
    public void FinalScore (View View) {
        String finalScore;
        finalScore = "NY Knicks: " + scoreTeamA + " - " + scoreTeamB + " :Chicago Bulls";
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
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given final score.
     */
    public void displayFinalScore(String score) {
        TextView scoreView = (TextView) findViewById(R.id.final_score);
        scoreView.setText("" + (score));
    }
}
