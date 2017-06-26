package com.lhd.meitu;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mt.mtxx.image.JNI;

public class MainActivity extends Activity
{

    private JNI jni;
    private ImageView iv_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jni = new JNI();
        iv_icon = (ImageView)findViewById(R.id.iv_icon);
    }
    //高亮
    public void lomoHDR(View v) {
        //1.得到图片的像素数组
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.girl);
        int[] pixels = new int[bitmap.getWidth()*bitmap.getHeight()];
        bitmap.getPixels(pixels , 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        //2. 调用native方法处理数据
        jni.StyleLomoHDR(pixels, bitmap.getWidth(), bitmap.getHeight());
        //3.返回回来重新生成图片
        Bitmap result_bitmap = Bitmap.createBitmap(pixels, bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        //4.显示
        iv_icon.setImageBitmap(result_bitmap);
    }
    //黑白
    public void lomoC(View v) {
        //1.得到图片的像素数组
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.girl);
        int[] pixels = new int[bitmap.getWidth()*bitmap.getHeight()];
        bitmap.getPixels(pixels , 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        //2. 调用native方法处理数据
        jni.StyleLomoC(pixels, bitmap.getWidth(), bitmap.getHeight());
        //3.返回回来重新生成图片
        Bitmap result_bitmap = Bitmap.createBitmap(pixels, bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        //4.显示
        iv_icon.setImageBitmap(result_bitmap);
    }
    //怀旧
    public void lomoB(View v) {
        //1.得到图片的像素数组
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.girl);
        int[] pixels = new int[bitmap.getWidth()*bitmap.getHeight()];
        bitmap.getPixels(pixels , 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        //2. 调用native方法处理数据
        jni.StyleLomoB(pixels, bitmap.getWidth(), bitmap.getHeight());
        //3.返回回来重新生成图片
        Bitmap result_bitmap = Bitmap.createBitmap(pixels, bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        //4.显示
        iv_icon.setImageBitmap(result_bitmap);
    }


    //还原
    public void reset(View v) {
        //1.得到图片的像素数组
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.girl);
//        int[] pixels = new int[bitmap.getWidth()*bitmap.getHeight()];
//        bitmap.getPixels(pixels , 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        //4.显示
        iv_icon.setImageResource(R.drawable.girl);
    }
}
