package com.example.dogrl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Happyway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happyway);
        final TextView callnumber = findViewById(R.id.callnumber);
        Button callbtn = findViewById(R.id.callbutton);
        final String strCallNumber = (String) callnumber.getText();



        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
