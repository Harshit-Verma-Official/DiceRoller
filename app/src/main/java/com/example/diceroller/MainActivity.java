package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void rollTapped(View view){
        int[] myDices = {R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,};
        ImageView dice = (ImageView) findViewById(R.id.dice);
        Random ran = new Random();
        int randomNumber = ran.nextInt(6);
        dice.setImageResource(myDices[randomNumber]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
