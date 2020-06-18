package com.example.dogrl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Happyway extends AppCompatActivity {

    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happyway);
        final TextView callnumber = findViewById(R.id.callnumber);
        Button callbtn = findViewById(R.id.callbutton);
        ImageView hd1 = findViewById(R.id.hd1);
        TextView noticeText = findViewById(R.id.noticeText);
        TextView kindText = findViewById(R.id.kindText);
        TextView ageText = findViewById(R.id.ageText);
        TextView neutText = findViewById(R.id.neutText);
        TextView careNmText = findViewById(R.id.careNmText);
        TextView markText = findViewById(R.id.markText);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        Log.d("data", data+"결과");

        String dataArr[] = data.split("@#");

        noticeText.setText(dataArr[0]);
        kindText.setText(dataArr[7]);
        ageText.setText(dataArr[1]);
        neutText.setText(dataArr[5]);
        careNmText.setText(dataArr[2]);
        callnumber.setText(dataArr[6]);
        markText.setText(dataArr[8]);

        final String image = dataArr[3];
        Thread mThread = new Thread() {

            public void run() {



                try {

                    URL url = new URL(image);

                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                    conn.setDoInput(true);

                    conn.connect();



                    InputStream is = conn.getInputStream();

                    bitmap = (Bitmap) BitmapFactory.decodeStream(is);





                } catch (IOException ex) {



                }

            }

        };



        mThread.start();

        try {

            mThread.join();

            hd1.setImageBitmap(bitmap);

        } catch (InterruptedException e) {



        }


        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String strCallNumber = (String) callnumber.getText();
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(Happyway.this);
                alertdialog.setMessage(strCallNumber + "로 전화 하시겠습니까?");

                alertdialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Happyway.this,"'확인' 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + strCallNumber));
                        startActivity(intent);
                    }
                });

                alertdialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Happyway.this,"'취소' 버튼이 눌렸습니다.",Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog alert = alertdialog.create();
                alert.setTitle("전화연결");
                alert.show();


            }
        });




    }
}
