/*package com.example.dogrl;


import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.graphics.drawable.Drawable;
        import android.graphics.drawable.GradientDrawable;
        import android.media.Image;
import android.widget.BaseAdapter;

import org.w3c.dom.Text;

        import java.io.IOException;
        import java.io.InputStream;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.util.ArrayList;

public class ListViewItemAdapter extends BaseAdapter {
    Bitmap bitmap;
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();
    public  ListViewItemAdapter(ArrayList<ListViewItem> arrays){

       public View getView(int position, View convertView, ViewGroup parent){

            final ListViewItem listVIewItem= listViewItemList.get(position);

            catImage.setImageDrawable(listVIewItem.geticon());
            catName.setText(listVIewItem.getName());
            catKind.setText("#"+listVIewItem.getKind());
            catAge.setText(listVIewItem.getAge());
            public void onClick(View view) {
            });



            Thread mThread = new Thread() {
                public void run() {

                    try {
                        URL url = new URL(listViewItemList.get(pos).geticon());
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
                catImage.setImageBitmap(bitmap);
            } catch (InterruptedException e) {

            }


            imageCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    @ @ -147, 7 + 182, 7 @@public void onClick (DialogInterface dialogInterface,
                    int i){
                        return convertView;
                    }


                    public  void additem(String ic, String name, String kind, String age, String sex, String helper, String phone, String status, String weight, String neut, String chara){
                        ListVIewItem item = new ListVIewItem();
                        item.seticon(ic);
                        item.setName(name);
                        item.setKind(kind);
                        item.setAge(age);
                        item.setSex(sex);
                        item.setHelper(helper);
                        item.setPhone(phone);
                        item.setStatus(status);
                        item.setWeight(weight);
                        item.setNeut(neut);
                        item.setChar(chara);

                        listViewItemList.add(item);

                    }

                }
*/