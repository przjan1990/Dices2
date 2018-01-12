package com.example.android.dices2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.dices2.R;

import java.util.Random;


import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    int dice1A = 0;
    int dice2A = 0;
    int dice3A = 0;
    int dice1B = 0;
    int dice2B = 0;
    int dice3B = 0;
    int clicksNumber1A = 0;
    int clicksNumber2A = 0;
    int clicksNumber3A = 0;
    int clicksNumber1B = 0;
    int clicksNumber2B = 0;
    int clicksNumber3B = 0;
    String scoreTeamA = "";
    String scoreTeamB = "";
    Random d1 = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void roll1A(View view) {

        dice1A = d1.nextInt(7 - 1) + 1;
        displayDice1A(dice1A);
        clicksNumber1A = clicksNumber1A + 1;
        if (clicksNumber1A > 2) {
            Button buttonRoll1st = (Button) findViewById(R.id.button_roll_1st);
            buttonRoll1st.setEnabled(false);

        }

    }

    public void roll2A(View view) {
        dice2A = d1.nextInt(7 - 1) + 1;
        displayDice2A(dice2A);
        clicksNumber2A = clicksNumber2A + 1;
        if (clicksNumber2A > 2) {
            Button buttonRoll2nd = (Button) findViewById(R.id.button_roll_2nd);
            buttonRoll2nd.setEnabled(false);

        }
    }

    public void roll3A(View view) {
        dice3A = d1.nextInt(7 - 1) + 1;
        displayDice3A(dice3A);
        clicksNumber3A = clicksNumber3A + 1;
        if (clicksNumber3A > 2) {
            Button buttonRoll3rd = (Button) findViewById(R.id.button_roll_3rd);
            buttonRoll3rd.setEnabled(false);

        }
    }

    public void roll1B(View view) {

        dice1B = d1.nextInt(7 - 1) + 1;
        displayDice1B(dice1B);
        clicksNumber1B = clicksNumber1B + 1;
        if (clicksNumber1B > 2) {
            Button buttonRoll1stb = (Button) findViewById(R.id.button_roll_1stb);
            buttonRoll1stb.setEnabled(false);

        }

    }

    public void roll2B(View view) {
        dice2B = d1.nextInt(7 - 1) + 1;
        displayDice2B(dice2B);
        clicksNumber2B = clicksNumber2B + 1;
        if (clicksNumber2B > 2) {
            Button buttonRoll2ndb = (Button) findViewById(R.id.button_roll_2ndb);
            buttonRoll2ndb.setEnabled(false);

        }
    }

    public void roll3B(View view) {
        dice3B = d1.nextInt(7 - 1) + 1;
        displayDice3B(dice3B);
        clicksNumber3B = clicksNumber3B + 1;
        if (clicksNumber3B > 2) {
            Button buttonRoll3rdb = (Button) findViewById(R.id.button_roll_3rdb);
            buttonRoll3rdb.setEnabled(false);

        }
    }

    public void reset(View view) {
        scoreTeamA = "";
        scoreTeamB = "";
        dice1A = 0;
        dice2A = 0;
        dice3A = 0;
        dice1B = 0;
        dice2B = 0;
        dice3B = 0;
        clicksNumber1A = 0;
        clicksNumber2A = 0;
        clicksNumber3A = 0;
        clicksNumber1B = 0;
        clicksNumber2B = 0;
        clicksNumber3B = 0;
        displayDice1A(dice1A);
        displayDice2A(dice2A);
        displayDice3A(dice3A);
        displayDice1B(dice1B);
        displayDice2B(dice2B);
        displayDice3B(dice3B);
        Button buttonRoll1st = (Button) findViewById(R.id.button_roll_1st);
        buttonRoll1st.setEnabled(true);
        Button buttonRoll2nd = (Button) findViewById(R.id.button_roll_2nd);
        buttonRoll2nd.setEnabled(true);
        Button buttonRoll3rd = (Button) findViewById(R.id.button_roll_3rd);
        buttonRoll3rd.setEnabled(true);
        Button buttonRoll1stb = (Button) findViewById(R.id.button_roll_1stb);
        buttonRoll1stb.setEnabled(true);
        Button buttonRoll2ndb = (Button) findViewById(R.id.button_roll_2ndb);
        buttonRoll2ndb.setEnabled(true);
        Button buttonRoll3rdb = (Button) findViewById(R.id.button_roll_3rdb);
        buttonRoll3rdb.setEnabled(true);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void count(View view){
        if ( dice1A != 0 && dice2A !=0 && dice3A != 0 &&
                ((dice1A == (dice2A + 1)) && (dice1A == (dice3A + 2))) ||
                ((dice2A == (dice1A + 1)) && (dice2A == (dice3A + 2))) ||
                ((dice3A == (dice1A + 1)) && (dice3A == (dice2A + 2))) ||
                ((dice2A == (dice1A + 1)) && (dice2A == (dice3A + 2))) ||
                ((dice3A == (dice2A + 1)) && (dice3A == (dice1A + 2))) ||
                ((dice1A == (dice3A + 1)) && (dice1A == (dice2A + 2)))
                )
            scoreTeamA = "straight";
        else if (dice1A != 0 && (dice1A == dice2A && dice3A == dice1A))
            scoreTeamA = "three of a kind";
        else if ((dice1A != 0 && dice2A != 0) &&(dice1A==dice2A || dice1A==dice3A || dice2A==dice3A ))
            scoreTeamA = "two of a kind";
        else
            scoreTeamA = "nothing";
        clicksNumber1A = 0;
        clicksNumber2A = 0;
        clicksNumber3A = 0;
        Button buttonRoll1st = (Button) findViewById(R.id.button_roll_1st);
        buttonRoll1st.setEnabled(true);
        Button buttonRoll2nd = (Button) findViewById(R.id.button_roll_2nd);
        buttonRoll2nd.setEnabled(true);
        Button buttonRoll3rd = (Button) findViewById(R.id.button_roll_3rd);
        buttonRoll3rd.setEnabled(true);
        displayForTeamA(scoreTeamA);

        if ( dice1B != 0 && dice2B !=0 && dice3B != 0 &&
                ((dice1B == (dice2B + 1)) && (dice1B == (dice3B + 2))) ||
                ((dice2B == (dice1B + 1)) && (dice2B == (dice3B + 2))) ||
                ((dice3B == (dice1B + 1)) && (dice3B == (dice2B + 2))) ||
                ((dice2B == (dice1B + 1)) && (dice2B == (dice3B + 2))) ||
                ((dice3B == (dice2B + 1)) && (dice3B == (dice1B + 2))) ||
                ((dice1B == (dice3B + 1)) && (dice1B == (dice2B + 2)))
                )
            scoreTeamB = "straight";
        else if (dice1B != 0 && (dice1B == dice2B && dice3B == dice1B))
            scoreTeamB = "three of a kind";
        else if ((dice1B != 0 && dice2B != 0) &&(dice1B==dice2B || dice1B==dice3B || dice2B==dice3B ))
            scoreTeamB = "two of a kind";
        else
            scoreTeamB = "nothing";
        clicksNumber1B = 0;
        clicksNumber2B = 0;
        clicksNumber3B = 0;
        Button buttonRoll1stb = (Button) findViewById(R.id.button_roll_1stb);
        buttonRoll1st.setEnabled(true);
        Button buttonRoll2ndb = (Button) findViewById(R.id.button_roll_2ndb);
        buttonRoll2nd.setEnabled(true);
        Button buttonRoll3rdb = (Button) findViewById(R.id.button_roll_3rdb);
        buttonRoll3rd.setEnabled(true);
        displayForTeamB(scoreTeamB);
    }

    public void displayDice1A(int score) {
        TextView scoreView = (TextView) findViewById(R.id.first_dice_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDice2A(int score) {
        TextView scoreView = (TextView) findViewById(R.id.second_dice_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDice3A(int score) {
        TextView scoreView = (TextView) findViewById(R.id.third_dice_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDice1B(int score) {
        TextView scoreView = (TextView) findViewById(R.id.first_dice_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDice2B(int score) {
        TextView scoreView = (TextView) findViewById(R.id.second_dice_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDice3B(int score) {
        TextView scoreView = (TextView) findViewById(R.id.third_dice_b);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    }

