package com.example.jhuang.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(score);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(teamBScore);
    }
    //increment team A score by 6
    public void addSixForTeamA(View v){
        teamAScore+=6;
        displayForTeamA(teamAScore);

    }
    //increment team A score by 3
    public void addThreeForTeamA(View v){
        teamAScore+=3;
        displayForTeamA(teamAScore);
    }
    //increment team A score by 2
    public void addTwoForTeamA(View v){
        teamAScore+=2;
        displayForTeamA(teamAScore);
    }
    //increment team A score by 1
    public void addOneForTeamA(View v){
        teamAScore+=1;
        displayForTeamA(teamAScore);
    }
    //increment team A score by 6
    public void addSixForTeamB(View v){
        teamAScore+=6;
        displayForTeamB(teamBScore);
    }
    //increment team A score by 3
    public void addThreeForTeamB(View v){
        teamAScore+=3;
        displayForTeamB(teamBScore);
    }
    //increment team A score by 2
    public void addTwoForTeamB(View v){
        teamAScore+=2;
        displayForTeamB(teamBScore);
    }
    //increment team A score by 1
    public void addOneForTeamB(View v){
        teamAScore+=1;
        displayForTeamB(teamBScore);
    }
    //reset score
    public void resetScore(View v){
        teamAScore=0;
        teamBScore=0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
