package com.hadarui.customview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hadarui.customview.R;

/**
 * Created by jly on 2017/7/21.
 */

public class ShaderView extends View {

    private BitmapShader mBitmapShader;
    private ShapeDrawable mShapeDrawable;
    private Bitmap mBitmap;
    private int mBitmapWidth,mBitmapHeight;


    public ShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mBitmap = ((BitmapDrawable) getResources().getDrawable(R.drawable.tim)).getBitmap();
        mBitmapWidth = mBitmap.getWidth();
        mBitmapHeight = mBitmap.getHeight();
        mBitmapShader = new BitmapShader(mBitmap,BitmapShader.TileMode.MIRROR, Shader.TileMode.REPEAT);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //ArcShape 扇形
        //OvalShape 椭圆
        //RectShape  矩形
//        RoundRectShape  圆角矩形
        mShapeDrawable = new ShapeDrawable(new ArcShape(80,80));
        Paint paint = mShapeDrawable.getPaint();
        paint.setShader(mBitmapShader);
        mShapeDrawable.setBounds(120,120,mBitmapWidth+120,mBitmapHeight+120);
        mShapeDrawable.draw(canvas);

    }
}
