package com.lhd.guolu;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    private PressureView pv_main;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pv_main = (PressureView) findViewById(R.id.pv_main);
        final JNI jni = new JNI();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    SystemClock.sleep(500);
                    int pressure =jni.getPressure();
                    pv_main.setPressure(pressure);
                    if (pressure > 250)
                    {
                        return;
                    }
                }
            }
        }).start();
    }
}
