package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.hadarui.customview.R;

/**
 * Created by jly on 2017/7/27.
 * 显示Bitmap
 */

public class TestBitmapView extends android.support.v7.widget.AppCompatImageView {
    private Bitmap mBitmap;

    public TestBitmapView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.tim);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(mBitmap,new Matrix(),new Paint());

    }
}
