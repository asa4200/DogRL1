package com.example.dogrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int i = 1;
    ImageView nextimg;
    TextView ExText1;
    TextView ExText2;
    TextView ExText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ShowAnoderButton = findViewById(R.id.ShowAnoderButton);
        Button happybtn = findViewById(R.id.Happywaybutton);
        Button tipbtn = findViewById(R.id.DogTipButton);
        Button DogCheckbtn = findViewById(R.id.DogCheckButton);
        Button youtube = findViewById(R.id.youtubelink);
        nextimg = (ImageView)findViewById(R.id.nextimg);
        ExText1 = (TextView)findViewById(R.id.ExText1);
        ExText2 = (TextView)findViewById(R.id.ExText2);
        ExText3 = (TextView)findViewById(R.id.ExText3);


        nextimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==15){
                    i = 1;
                }


                i = i+1;
                switch (i){
                    case 1 :
                        nextimg.setImageResource(R.drawable.d001);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 2 :
                        nextimg.setImageResource(R.drawable.d002);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("수정될 텍스트 입니다.");
                        break;
                    case 3 :
                        nextimg.setImageResource(R.drawable.d003);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 4 :
                        nextimg.setImageResource(R.drawable.d004);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 5 :
                        nextimg.setImageResource(R.drawable.d005);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 6 :
                        nextimg.setImageResource(R.drawable.d006);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 7 :
                        nextimg.setImageResource(R.drawable.d007);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 8 :
                        nextimg.setImageResource(R.drawable.d008);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 9 :
                        nextimg.setImageResource(R.drawable.d009);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 10 :
                        nextimg.setImageResource(R.drawable.d010);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 11 :
                        nextimg.setImageResource(R.drawable.d011);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 12 :
                        nextimg.setImageResource(R.drawable.d012);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 13 :
                        nextimg.setImageResource(R.drawable.d013);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 14 :
                        nextimg.setImageResource(R.drawable.d014);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                    case 15 :
                        nextimg.setImageResource(R.drawable.d015);
                        ExText1.setText("서울특별시-중구-2020-00001");
                        ExText2.setText("2세 서울 중앙 보호소");
                        ExText3.setText("분양대기중");
                        break;
                }

            }
        });

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

