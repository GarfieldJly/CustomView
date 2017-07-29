package com.hadarui.customview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hadarui.customview.util.QRCodeUtil;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup rootView = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.activity_test2,null);
        setContentView(rootView);

        // TODO: 2017/7/26  实现圆饼图
//        ArrayList<PieData> list = new ArrayList<>();
//        list.add(new PieData(30,30,60));
//        list.add(new PieData(30,30,60));
//        list.add(new PieData(30,30,60));
//        list.add(new PieData(30,30,60));
//        list.add(new PieData(30,30,60));
//        PieView pieView = new PieView(this);
//        pieView.setData(list);
//
//        rootView.addView(pieView);



//        int a = 5/10;
//        Log.e(TAG, "onCreate: a :"+a );


//        ImageView view = (ImageView) findViewById(R.id.test_iv);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 计算中心点（这里是使用view的中心作为旋转的中心点）
//                final float centerX = v.getWidth() / 2.0f;
//                final float centerY = v.getHeight() / 2.0f;
//
//                //括号内参数分别为（上下文，开始角度，结束角度，x轴中心点，y轴中心点，深度，是否扭曲）
//                final Rotate3dAnimation rotation = new Rotate3dAnimation(
//                        MainActivity.this, 0, 360,
//                        centerX, centerY, 0f, true);
//
//                rotation.setDuration(3000);                         //设置动画时长
//                rotation.setFillAfter(true);                        //保持旋转后效果
//                rotation.setInterpolator(new LinearInterpolator());	//设置插值器
//                v.startAnimation(rotation);
//            }
//        });


        init();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_CANCEL:
                break;
            case MotionEvent.ACTION_OUTSIDE:
                break;
        }


        return super.onTouchEvent(event);
    }

    /**
     * 生成二维码
     */
    private void init(){
        ImageView qrIv = (ImageView) findViewById(R.id.qr_iv);
        String url = "https://fir.im/cloudreader";
        QRCodeUtil.showThreadImage(this, url, qrIv, R.mipmap.ic_launcher);

    }
}
