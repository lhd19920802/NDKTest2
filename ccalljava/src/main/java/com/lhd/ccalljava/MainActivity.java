package com.lhd.ccalljava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JNIS jnis = new JNIS();
        jnis.callbackHelloFromJava();
        jnis.callbackAdd();
        jnis.callbackPrintString();
        jnis.callbackSayHello();
        callbackShowToast();
    }
    public native void callbackShowToast();

    public void showToast(){
        Toast.makeText(this, "C调用显示出来的哦", 1).show();
    }
}
