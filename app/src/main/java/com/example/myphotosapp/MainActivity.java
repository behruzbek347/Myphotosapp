package com.example.myphotosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView diceImage1 = findViewById(R.id.imgDice1);
        ImageView diceImage2 = findViewById(R.id.imgDice2);

        final int [] diceImages = {R.drawable.cat, R.drawable.img,R.drawable.no,R.drawable.olov,R.drawable.markaz};

        //        diceImages[2]

        Button btnRoll = findViewById(R.id.btnRollTheDice);



        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("MyDiceApp","btnRoll is tapped now");

                Random rndObject = new Random();


                int myRandomNumber = rndObject.nextInt(4);//0..5

                Log.i("MyDiceApp","The generated random number is" + myRandomNumber);

                diceImage1.setImageResource(diceImages[myRandomNumber]);

                myRandomNumber = rndObject.nextInt(4);

                diceImage2.setImageResource(diceImages[myRandomNumber]);




            }
        });




    }
}