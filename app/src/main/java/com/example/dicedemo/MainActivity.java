package com.example.dicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we have two images left dice and right dice
        // link the code to those two image view inside your layout.....(activity main)
        final ImageView leftDie = findViewById(R.id.Left_dice);
        final ImageView rightDie = findViewById(R.id.right_dice);
        //H AND L buttons
        Button higherButton = findViewById(R.id.higher_button);
        Button lowerButton = findViewById(R.id.lower_button);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right
        // image view inside your app!
        // Click listener look for an event on your view components.
       higherButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Random rand = new Random();
               //user die left
               int randLeftDie = rand.nextInt(6);
               //computer die right
               int randRightDie = rand.nextInt(6);

               TextView result_info = findViewById(R.id.result);

               Log.d("left die",String.valueOf(randLeftDie));
               Log.d("right die",String.valueOf(randRightDie));

               if(randLeftDie>randRightDie){
                   Log.d("result","User Won");
                   result_info.setText("User Won!");
               }else if (randRightDie>randLeftDie){
                   Log.d("result","Computer Won");
                   result_info.setText("Computer Won!");
               }else{
                   Log.d("result","draw");
                   result_info.setText("Its a Tie!");
               }

                leftDie.setImageResource(diceArray[randLeftDie]);
               rightDie.setImageResource(diceArray[randRightDie]);
               // we need to create a random integer for picking the dices randomly!




           }
       });

       lowerButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random rand = new Random();
               //user die left
               int randLeftDie = rand.nextInt(6);
               //computer die right
               int randRightDie = rand.nextInt(6);

               //textView
               TextView result_info = findViewById(R.id.result);


               Log.d("left die",String.valueOf(randLeftDie));
               Log.d("right die",String.valueOf(randRightDie));


               if(randLeftDie>randRightDie){
                   Log.d("result","Computer Won");
                   //U string from strings.xml
                   result_info.setText("Computer Won!");
               }else if (randRightDie>randLeftDie){
                   Log.d("result","User Won");
                   result_info.setText("User Won!");
               }else{
                   Log.d("result","draw");
                   result_info.setText("Its a Tie!");
               }

               leftDie.setImageResource(diceArray[randLeftDie]);
               rightDie.setImageResource(diceArray[randRightDie]);

           }
       });
    }



}
