package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int foulsTeamA = 0;
    int assistsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamB = 0;
    int assistsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the number of goals for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of fouls for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of assists for Team A.
     */
    public void displayAssistsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_assists);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of goals for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of assists for Team B.
     */
    public void displayAssistsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_assists);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the number of goals for team A by 1 point
     */
    public void addGoalForTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    /**
     * Increase the number of fouls for team A by 1 point
     */
    public void addFoulForTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the number of assists for team A by 1 point
     */
    public void addAssistForTeamA(View v) {
        assistsTeamA = assistsTeamA + 1;
        displayAssistsForTeamA(assistsTeamA);
    }

    /**
     * Increase the number of goals for team B by 1 point
     */
    public void addGoalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    /**
     * Increase the number of fouls for team B by 1 point
     */
    public void addFoulForTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Increase the number of assists for team B by 1 point
     */
    public void addAssistForTeamB(View v) {
        assistsTeamB = assistsTeamB + 1;
        displayAssistsForTeamB(assistsTeamB);
    }

    /**
     * Reset the score for team A and B
     */
    public void resetScore(View v) {
        goalsTeamA = 0;
        foulsTeamA = 0;
        assistsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamB = 0;
        assistsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayAssistsForTeamA(assistsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayFoulsForTeamB(foulsTeamB);
        displayAssistsForTeamB(assistsTeamB);
    }

}
