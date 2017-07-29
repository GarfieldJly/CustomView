package com.hadarui.customview.view;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jly on 2017/7/26.
 */
public class TestCanvasView extends View {
    private Paint mPaint;
    private int mWidth,mHeight;

    public TestCanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint  = new Paint();
        mPaint.setColor(Color.BLACK);
       // STROKE       描边
       // FILL        填充
       // FILL_AND_STROKE   描边加填充
        mPaint.setStyle(Paint.Style.STROKE);  //设置画笔模式为填充
        mPaint.setStrokeWidth(2f);         //设置画笔宽度为10px
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
//        canvas.drawColor(Color.RED);

//        canvas.drawPoint(400,400,mPaint);
//
//        canvas.drawPoints(new float[]{400,500,400,600},mPaint);

        // 第一种
//        RectF rectF = new RectF(100,100,800,400);
//        canvas.drawRoundRect(rectF,30,30,mPaint);
//
//        mPaint.setColor(Color.RED);
//        canvas.drawRoundRect(rectF,400,200,mPaint);

//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setColor(Color.BLACK);
//        mPaint.setStrokeWidth(5f);
//
//        canvas.drawCircle(500,500,200,mPaint);
//
//        RectF rectf = new RectF(300,300,700,700);
//        mPaint.setStyle(Paint.Style.FILL);
//        mPaint.setColor(Color.GREEN);
//        canvas.drawArc(rectf,0,90,true,mPaint);
//
//        mPaint.setColor(Color.RED);
//        canvas.drawArc(rectf,90,150,true,mPaint);
//
//        mPaint.setColor(Color.YELLOW);
//        canvas.drawArc(rectf,150,270,true,mPaint);
//
//        mPaint.setColor(Color.BLUE);
//        canvas.drawArc(rectf,270,360,true,mPaint);

//        canvas.drawLine(0,0,100,0,mPaint);
//        canvas.rotate(30);

        canvas.translate(mWidth/2,mHeight/2);
        Rect rect = new Rect(-400,-400,400,400);
        canvas.drawRect(rect,mPaint);

        for(int i = 0; i < 20; i++){
            canvas.scale(0.9f,0.9f);
            canvas.drawRect(rect,mPaint);
        }

    }
}
