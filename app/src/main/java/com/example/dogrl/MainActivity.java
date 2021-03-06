package com.example.dogrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public int i = 1;
    ImageView nextimg;
    TextView ExText1;
    TextView ExText2;
    TextView ExText3;
    TextView SendText;
    Bitmap bitmap;

    boolean initem = false, inAge = false, inCareNm = false, inNoticeNo = false, inProcessState = false, inPopFile = false, inKindCd = false, inNeuterYn = false, inCaretel = false, insexCd = false, inMark = false;
    String age = null, careNm = null, noticeNo = null, processState = null, popfile = null, KindCd = null, neuterYn = null, caretel = null, sexCd = null, mark = null;


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
        SendText = findViewById(R.id.SendText);

        StrictMode.enableDefaults();
        SimpleDateFormat formatter = new SimpleDateFormat (
                "yyyyMMdd", Locale.KOREA );
        Date currentTime = new Date ( );
        final String time = formatter.format ( currentTime );
        final String ago = "20200601";


        APIGO(ago,time, 1);
        ShowAnoderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ran = new Random();
                int random = ran.nextInt(20)+1;
                APIGO(ago,time,random);
            }
        });

      /*  nextimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==15){
                    i = 0;
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
        }); */



        happybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Happyway.class);
                intent.putExtra("data",SendText.getText().toString());
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

    private void APIGO(final String ago, final String time, int number){
        Log.d("API","APIGO 시작"+ago+"  "+time);

       try{


           URL url = new URL("http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/abandonmentPublic?bgnde="+ago+"&endde="+time+"&pageNo="+number+"&numOfRows="+"1"+"&ServiceKey=1O5TyVjRbo1%2FC5JVf9%2FNZIV2D6FSMXBUZe0MVRTwYQBFnk2GFESxQSZ1zLoJkddQWKRSjJ0y78xRxZt0Zo0S2g%3D%3D&_returnType=json");

           XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
           XmlPullParser parser = parserCreator.newPullParser();

           parser.setInput(url.openStream(), null);
           int parserEvent = parser.getEventType();
           System.out.println("파싱시작합니다.");



           while (parserEvent != XmlPullParser.END_DOCUMENT) {

               switch (parserEvent) {
                   case XmlPullParser.START_TAG://parser가 시작 태그를 만나면 실행
                       if (parser.getName().equals("age")) { //title 만나면 내용을 받을수 있게 하자
                           inAge = true;
                       }
                       if (parser.getName().equals("careNm")) { //mapx 만나면 내용을 받을수 있게 하자
                           inCareNm = true;
                       }
                       if (parser.getName().equals("noticeNo")) { //mapy 만나면 내용을 받을수 있게 하자
                           inNoticeNo = true;
                       }
                       if (parser.getName().equals("processState")) { //mapy 만나면 내용을 받을수 있게 하자
                           inProcessState = true;
                       }
                       if (parser.getName().equals("popfile")) { //mapy 만나면 내용을 받을수 있게 하자
                           inPopFile = true;
                       }
                       if(parser.getName().equals("KindCd")){
                           inKindCd = true;

                       }if(parser.getName().equals("careTel")){
                           inCaretel = true;
                   }if(parser.getName().equals("sexCd")){
                           insexCd = true;
                   }if(parser.getName().equals("specialMark")){
                           inMark = true;
                   }if(parser.getName().equals("neuterYn")){
                           inNeuterYn = true;
                   }

                       if (parser.getName().equals("message")) { //message 태그를 만나면 에러 출력

                           //여기에 에러코드에 따라 다른 메세지를 출력하도록 할 수 있다.
                       }
                       break;

                   case XmlPullParser.TEXT://parser가 내용에 접근했을때
                       if (inAge) { //isTitle이 true일 때 태그의 내용을 저장.
                           age = parser.getText();
                           inAge = false;
                       }
                       if (inCareNm) { //isMapx이 true일 때 태그의 내용을 저장.
                           careNm = parser.getText();
                           inCareNm = false;
                       }
                       if (inNoticeNo) { //isMapy이 true일 때 태그의 내용을 저장.
                           noticeNo = parser.getText();
                           inNoticeNo = false;
                       }
                       if (inProcessState) { //isMapy이 true일 때 태그의 내용을 저장.
                           processState = parser.getText();
                           inProcessState = false;
                       }
                       if (inPopFile) { //isMapy이 true일 때 태그의 내용을 저장.
                           popfile = parser.getText();
                           inPopFile = false;
                       }
                       if(inKindCd){
                           KindCd = parser.getText();
                           inKindCd = false;
                       }
                       if(inNeuterYn){
                           neuterYn = parser.getText();
                           inNeuterYn = false;
                       }if(inCaretel){
                           caretel = parser.getText();
                           inCaretel = false;
                   }if(insexCd){
                           sexCd = parser.getText();
                           insexCd = false;
                   }if(inMark){
                           mark = parser.getText();
                           inMark = false;
                   }

                       break;
                   case XmlPullParser.END_TAG:
                       Log.d("API","점검");

                       if (parser.getName().equals("item")) {


                           ExText1.setText(""+noticeNo);
                           ExText2.setText(""+age+" "+careNm);
                           ExText3.setText(""+processState);
                           SendText.setText(noticeNo+"#@"+age+"#@"+careNm+"#@"+popfile+"#@"+sexCd+"#@"+neuterYn+"#@"+caretel+"#@"+KindCd+"#@"+mark);

                           final String image = popfile;
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

                               nextimg.setImageBitmap(bitmap);

                           } catch (InterruptedException e) {



                           }

                           initem = false;
                       }
                       break;
               }
               parserEvent = parser.next();
           }

       }catch (Exception e){

        Log.d("error","  "+e);
       }






    }
}



