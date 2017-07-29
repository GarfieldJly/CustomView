package com.hadarui.customview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by jly on 2017/7/21.
 */

public class SquareImageView extends android.support.v7.widget.AppCompatImageView {
    private static final String TAG = "SquareImageView";
    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "onLayout: "+getMeasuredWidth());

        Log.d(TAG, "onLayout: "+getMeasuredHeight());
    }
}
