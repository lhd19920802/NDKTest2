package com.lhd.guolu;

/**
 * Created by lihuaidong on 2017/6/25 18:29.
 * 微信：lhd520ssp
 * QQ:414320737
 * 作用：
 */
public class JNI
{
    static {
        System.loadLibrary("guolu");
    }
    //native代码-得到锅炉的压力值
    public native int getPressure();
}
