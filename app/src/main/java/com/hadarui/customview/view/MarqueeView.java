package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by jly on 2017/7/21.
 * 跑马灯
 */

public class MarqueeView extends android.support.v7.widget.AppCompatTextView {
    public MarqueeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean isFocused() {
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec); //宽度
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);  //宽度使用的测量模式

        int height = MeasureSpec.getSize(heightMeasureSpec); //高度
        int heightMode = MeasureSpec.getMode(heightMeasureSpec); // 高度使用的测量模式

//        setMeasuredDimension();  对宽高进行修行修改
    }

    //这个函数在视图大小发生改变时调用。
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }


    //确定子View布局位置(onLayout)
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    //绘制内容
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
    }
}
