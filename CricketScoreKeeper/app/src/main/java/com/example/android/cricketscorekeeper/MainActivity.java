package com.example.android.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runsForTeamA = 0;
    int wicketsForTeamA = 0;
    int oversForTeamA = 0;
    int runsForTeamB = 0;
    int wicketsForTeamB = 0;
    int oversForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Add six runs to the runs for Team A
    public void addSixRunsForTeamA(View view) {
        runsForTeamA = runsForTeamA + 6;
        displayRunsForTeamA(runsForTeamA);
    }

    // Add Four runs to the runs for Team A
    public void addFourRunsForTeamA(View view) {
        runsForTeamA = runsForTeamA + 4;
        displayRunsForTeamA(runsForTeamA);
    }

    // Add One runs to the runs for Team A
    public void addOneRunForTeamA(View view) {
        runsForTeamA = runsForTeamA + 1;
        displayRunsForTeamA(runsForTeamA);
    }

    // Add One wicket to the wickets for Team A
    public void addOneWicketForTeamA(View view) {
        wicketsForTeamA = wicketsForTeamA + 1;
        displayWicketsForTeamA(wicketsForTeamA);
    }

    // Add One over to the overs for Team A
    public void addOneOverForTeamA(View view) {
        oversForTeamA = oversForTeamA + 1;
        displayOversForTeamA(oversForTeamA);
    }

    // Add six runs to the runs for Team B
    public void addSixRunsForTeamB(View view) {
        runsForTeamB = runsForTeamB + 6;
        displayRunsForTeamB(runsForTeamB);
    }

    // Add Four runs to the runs for Team B
    public void addFourRunsForTeamB(View view) {
        runsForTeamB = runsForTeamB + 4;
        displayRunsForTeamB(runsForTeamB);
    }

    // Add One runs to the runs for Team B
    public void addOneRunForTeamB(View view) {
        runsForTeamB = runsForTeamB + 1;
        displayRunsForTeamB(runsForTeamB);
    }

    // Add One wicket to the wickets for Team B
    public void addOneWicketForTeamB(View view) {
        wicketsForTeamB = wicketsForTeamB + 1;
        displayWicketsForTeamB(wicketsForTeamB);
    }

    // Add One over to the overs for Team B
    public void addOneOverForTeamB(View view) {
        oversForTeamB = oversForTeamB + 1;
        displayOversForTeamB(oversForTeamB);
    }

    public void resetsEverything(View view) {
        runsForTeamA = 0;
        wicketsForTeamA = 0;
        oversForTeamA = 0;
        runsForTeamB = 0;
        wicketsForTeamB = 0;
        oversForTeamB = 0;
        displayRunsForTeamA(runsForTeamA);
        displayWicketsForTeamA(wicketsForTeamA);
        displayOversForTeamA(oversForTeamA);
        displayRunsForTeamB(runsForTeamB);
        displayWicketsForTeamB(wicketsForTeamB);
        displayOversForTeamB(oversForTeamB);

    }


    /**
     * Displays the given runs for Team A.
     */
    public void displayRunsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayWicketsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayOversForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_overs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayRunsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayWicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayOversForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_overs);
        scoreView.setText(String.valueOf(score));
    }
}
