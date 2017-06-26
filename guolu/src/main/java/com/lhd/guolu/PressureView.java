package com.lhd.guolu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lihuaidong on 2017/6/25 18:34.
 * 微信：lhd520ssp
 * QQ:414320737
 * 作用：
 */
public class PressureView extends View
{

    private int max = 250;
    private int pressure;
    private Paint paint;

    public int getMax()
    {
        return max;
    }

    public void setMax(int max)
    {
        this.max = max;
    }

    public int getPressure()
    {
        return pressure;
    }

    public void setPressure(int pressure)
    {
        this.pressure = pressure;
        postInvalidate();
    }

    public PressureView(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        paint = new Paint();
        paint.setTextSize(40);
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {

        if (pressure > max)
        {
            paint.setColor(Color.RED);
            canvas.drawText("要爆炸了, 兄弟快跑!", 30, getHeight() / 2, paint);
        }
        else
        {
            paint.setColor(Color.GRAY);
            canvas.drawRect(20, 0, 60, getHeight(), paint);

            int p = pressure * 250 / max;
            if (p < 200)
            {
                paint.setColor(Color.GREEN);
            }
            else
            {
                paint.setColor(Color.RED);
            }
            canvas.drawRect(20, getHeight() - getHeight() * pressure / max, 60, getHeight(), paint);
        }
    }
}
