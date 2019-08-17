package com.example.particlesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(new SplitView(this));

//        //获取图片对象
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.pic);
//        //获取图片的宽高，即图片的像素
//        bitmap.getWidth();//水平方向有多少个像素
//        bitmap.getHeight();//竖直方向有多少个像素
//        int pixel = bitmap.getPixel(0,0);

    }
}
