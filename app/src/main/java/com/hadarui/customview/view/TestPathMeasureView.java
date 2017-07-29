package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
/**
 * Created by jly on 2017/7/27.
 *
 * PathMeasure  的用法
 */

public class TestPathMeasureView extends View{
    private static final String TAG = "TestPathMeasureView";
    private Paint mPaint;
    private int mWidth,mHeight;
    public TestPathMeasureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w/2;
        mHeight = h/2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.translate(mWidth,mHeight);
        Path path1 = new Path();
        path1.lineTo(0,200);
        path1.lineTo(200,200);
        path1.lineTo(200,0);

        PathMeasure pathMeasure1 = new PathMeasure(path1,false);
        PathMeasure pathMeasure2 = new PathMeasure(path1,true);


        Log.e(TAG, "onDraw: "+pathMeasure1.getLength() );
        Log.e(TAG, "onDraw: "+pathMeasure2.getLength() );
        canvas.drawPath(path1,mPaint);


    }
}
