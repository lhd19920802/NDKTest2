package com.lhd.ccalljava;

import android.util.Log;

/**
 * Created by lihuaidong on 2017/6/23 15:26.
 * 微信：lhd520ssp
 * QQ:414320737
 * 作用：
 */
public class JNIS
{
    static{
        System.loadLibrary("ccalljava");
    }

    public native void callbackHelloFromJava();
    public native void callbackAdd();
    public native void callbackPrintString();
    public native void callbackSayHello();

    public void helloFromJava() {
        Log.e("TAG", "helloFromJava()");
    }

    public int add(int x,int y)
    {
        Log.e("TAG", "x=="+x+",y=="+y+",sum=="+(x+y));
        return x+y;
    }

    public void printString(String s) {
        Log.e("TAG","C中输入的：" + s);
    }
    public static void sayHello(String s){
        Log.e("TAG",  "我是java代码中的JNI."
                      + "java中的sayHello(String s)静态方法，我被C调用了:"+ s);
    }


}
