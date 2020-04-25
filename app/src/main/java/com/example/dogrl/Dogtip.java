package com.example.dogrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dogtip extends AppCompatActivity {


    private ImageView dog1;
    ImageView dog2;
    ImageView dog3;
    ImageView dog4;
    ImageView dog5;
    ImageView dog6;
    ImageView dog7;
    ImageView dog8;
    ImageView dog9;
    ImageView dog10;
    ImageView dog11;
    ImageView dog12;
    ImageView dog13;
    ImageView dog14;
    ImageView dog15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogtip);
        dog1 =  (ImageView)findViewById(R.id.dog1);
        dog2 =  (ImageView)findViewById(R.id.dog2);
        dog3 =  (ImageView)findViewById(R.id.dog3);
        dog4 =  (ImageView)findViewById(R.id.dog4);
        dog5 =  (ImageView)findViewById(R.id.dog5);
        dog6 =  (ImageView)findViewById(R.id.dog6);
        dog7 =  (ImageView)findViewById(R.id.dog7);
        dog8 =  (ImageView)findViewById(R.id.dog8);
        dog9 =  (ImageView)findViewById(R.id.dog9);
        dog10 =  (ImageView)findViewById(R.id.dog10);
        dog11 =  (ImageView)findViewById(R.id.dog11);
        dog12 =  (ImageView)findViewById(R.id.dog12);
        dog13 =  (ImageView)findViewById(R.id.dog13);
        dog14 =  (ImageView)findViewById(R.id.dog14);
        dog15 =  (ImageView)findViewById(R.id.dog15);


    }
    public void showEx(View v){
        Intent intent = new Intent(Dogtip.this,DogEx.class);
        switch(v.getId()){
            case R.id.dog1 :
                intent.putExtra("견종번호","1");
                break;
            case R.id.dog2 :
                intent.putExtra("견종번호","2");
                break;
            case R.id.dog3 :
                intent.putExtra("견종번호","3");
                break;
            case R.id.dog4 :
                intent.putExtra("견종번호","4");
                break;
            case R.id.dog5 :
                intent.putExtra("견종번호","5");
                break;
            case R.id.dog6 :
                intent.putExtra("견종번호","6");
                break;
            case R.id.dog7 :
                intent.putExtra("견종번호","7");
                break;
            case R.id.dog8 :
                intent.putExtra("견종번호","8");
                break;
            case R.id.dog9 :
                intent.putExtra("견종번호","9");
                break;
            case R.id.dog10 :
                intent.putExtra("견종번호","10");
                break;
            case R.id.dog11 :
                intent.putExtra("견종번호","11");
                break;
            case R.id.dog12 :
                intent.putExtra("견종번호","12");
                break;
            case R.id.dog13 :
                intent.putExtra("견종번호","13");
                break;
            case R.id.dog14 :
                intent.putExtra("견종번호","14");
                break;
            case R.id.dog15 :
                intent.putExtra("견종번호","15");
                break;
        }
        startActivity(intent);

    }

}
