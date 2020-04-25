package com.example.dogrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ShowAnoderButton = findViewById(R.id.ShowAnoderButton);
        Button happybtn = findViewById(R.id.Happywaybutton);
        Button tipbtn = findViewById(R.id.DogTipButton);
        Button DogCheckbtn = findViewById(R.id.DogCheckButton);
        Button youtube = findViewById(R.id.youtubelink);

        happybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Happyway.class);
                startActivity(intent);
            }
        });
        tipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dogtip.class);
                startActivity(intent);
            }
        });
        DogCheckbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DogCheck.class);
                startActivity(intent);
            }
        });
        ShowAnoderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this,)
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=sieXiZLQszE")
                );

                startActivity(intent);
            }
        });

    }
}

