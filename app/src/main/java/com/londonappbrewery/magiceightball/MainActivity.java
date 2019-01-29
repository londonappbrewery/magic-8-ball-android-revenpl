package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int tab[] = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };

        final Button askingButton = (Button) findViewById(R.id.buttonAsk);

        final ImageView ballImage = (ImageView) findViewById(R.id.ball);

        askingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random i = new Random();

                int x = i.nextInt(4);
                Log.d("Inf", "Random number " + x);
                ballImage.setImageResource(tab[x]);
            }
        });



    }
}
