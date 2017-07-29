package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jly on 2017/7/26.
 * 两个圆环的View
 */

public class TestCircleView extends View {
    private Paint mPaint;
    private int mWidth,mHeight;

    public TestCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.translate(mWidth/2,mHeight/2);
        canvas.drawCircle(0,0,300,mPaint);
        canvas.drawCircle(0,0,280,mPaint);


        canvas.rotate(30);
        canvas.drawLine(0,0,100,0,mPaint);


        for(int i = 0; i <= 360; i+=10 ){
            canvas.drawLine(0,280,0,300,mPaint);
            canvas.rotate(20);
        }




    }
}
