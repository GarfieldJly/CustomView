package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jly on 2017/7/27.
 * 学习Path的用法
 */

public class TestPathView extends View {
    private Path mPath;
    private Paint mPaint;
    private int mWidth,mHeight;

    public TestPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        mPaint.setColor(Color.GREEN);

        mPath = new Path();
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
//        canvas.translate(mWidth/2,mHeight/2); // 移动坐标系到屏幕中心

//        mPath.lineTo(200,200);
//        mPath.lineTo(200,0);
//        mPath.close();
//
//        canvas.drawPath(mPath,mPaint);

//        canvas.scale(1,-1); // <-- 注意 翻转y坐标轴
//        mPath.lineTo(100,100);
//
//        RectF rect = new RectF(0,0,300,300);
//        mPath.addArc(rect,0,270);
//
//        canvas.drawPath(mPath,mPaint);

//        canvas.translate(mWidth / 2, mHeight / 2);
//        canvas.scale(1,-1);
//
//        Path mPath = new Path();
//        mPath.lineTo(100,100);
//
//        RectF oval = new RectF(0,0,300,300);
////        mPath.addArc(oval,0,270);
//        mPath.arcTo(oval,0,270,false);             // <-- 和上面一句作用等价
//
//        canvas.drawPath(mPath,mPaint);



        canvas.translate(mWidth / 2, mHeight / 2);  // 移动坐标系到屏幕中心
        canvas.scale(1,-1);                         // <-- 注意 翻转y坐标轴

        Path path = new Path();                     // path中添加一个圆形(圆心在坐标原点)
        path.addCircle(0,0,100, Path.Direction.CW);

        Path dst = new Path();                      // dst中添加一个矩形
        dst.addRect(-200,-200,200,200, Path.Direction.CW);

        path.offset(300,0,dst);                     // 平移

        canvas.drawPath(path,mPaint);               // 绘制path

        mPaint.setColor(Color.BLUE);                // 更改画笔颜色

        canvas.drawPath(dst,mPaint);                // 绘制dst

    }
}
