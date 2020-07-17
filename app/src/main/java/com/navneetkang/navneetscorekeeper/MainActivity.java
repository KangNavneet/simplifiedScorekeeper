package com.navneetkang.navneetscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int countA=0;
    int countB=0;
    int scoreA=0;
    int scoreB=0;
    int score=0;
    TextView teamAScore;
    TextView teamBScore;
    RadioButton  wide,four,six;
    TextView result;
    TextView setRules;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button activeTeamB=findViewById(R.id.active_teamB);


        Button increaseScoreA=findViewById(R.id.team_a_increase);
        Button increaseScoreB=findViewById(R.id.team_b_increase);
        Button decreaseScoreA=findViewById(R.id.team_a_decrease);
        Button decreaseScoreB=findViewById(R.id.team_b_decrease);
         rg=findViewById(R.id.scoreChange);

        wide=findViewById(R.id.score_1);
        four=findViewById(R.id.score_4);
        six=findViewById(R.id.score_6);

        teamAScore=findViewById(R.id.teamAScore);
        teamBScore=findViewById(R.id.teamBScore);





        increaseScoreA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectRadio();
                scoreA+=score;
                update();

            }
        });
        increaseScoreB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectRadio();
                scoreB+=score;
                update();
            }
        });

        decreaseScoreA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectRadio();
                scoreA-=score;
                update();


            }
        });

        decreaseScoreB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectRadio();
              scoreB-=score;

                update();

            }
        });











    }

    public void update()
    {

        teamAScore.setText(scoreA+"");
        teamBScore.setText(scoreB+"");

    }

    public void selectRadio()
    {
        switch(rg.getCheckedRadioButtonId())
        {
            case R.id.score_1:
                score=1;
                break;


            case R.id.score_4:
                score=4;
                break;


            case R.id.score_6:
                score=6;
                break;

        }
    }
}
