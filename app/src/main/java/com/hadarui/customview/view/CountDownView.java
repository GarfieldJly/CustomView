package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jly on 2017/7/21.
 */

public class CountDownView extends View implements View.OnClickListener{
    private Paint mPaint;
    private Rect mRect;
    private int mCount;


    public CountDownView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRect = new Rect();
        setOnClickListener(this);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.YELLOW);
        canvas.drawRect(0,0,getWidth(),getHeight(),mPaint);
        mPaint.setColor(Color.GREEN);
        mPaint.setTextSize(40);
        String text = String.valueOf(mCount);
        mPaint.getTextBounds(text,0,text.length(),mRect);
        float textWidth = mRect.width();
        float textHeight = mRect.height();
        canvas.drawText(text,getWidth()/2 - textWidth/2,getHeight()/2+textHeight/2,mPaint);
    }

    @Override
    public void onClick(View v) {
        mCount++;
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:

                break;
        }
        return super.onTouchEvent(event);
    }
}
