package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jly on 2017/7/27.
 * 二阶贝塞尔曲线，跟随手指而扭动
 */

public class BezierView extends View {
    private Paint mPaint;
    private PointF start,end,control;
    private int centerX,centerY;

    public BezierView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLUE);
        mPaint.setTextSize(60);

        start = new PointF(0,0);
        end = new PointF(0,0);
        control = new PointF(0,0);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        centerX = w/2;
        centerY = h/2;

        // 初始化数据点和控制点的位置
        start.x = centerX-200;
        start.y = centerY;
        end.x = centerX+200;
        end.y = centerY;
        control.x = centerX;
        control.y = centerY-100;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawPoint(start.x,start.y,mPaint);
        canvas.drawPoint(end.x,end.y,mPaint);
        canvas.drawPoint(control.x,control.y,mPaint);


        mPaint.setColor(Color.GREEN);
        canvas.drawLine(start.x,start.y,control.x,control.y,mPaint);
        canvas.drawLine(control.x,control.y,end.x,end.y,mPaint);

        mPaint.setColor(Color.RED);
        Path path = new Path();
        path.moveTo(start.x,start.y);
        path.quadTo(control.x,control.y,end.x,end.y);

        canvas.drawPath(path,mPaint);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        control.x = event.getX();
        control.y = event.getY();
        invalidate();
        return true;

    }
}
