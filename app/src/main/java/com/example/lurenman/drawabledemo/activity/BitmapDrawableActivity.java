package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.lurenman.drawabledemo.R;

/**
 * @author: baiyang.
 * Created on 2017/10/31.
 * 参考
 * http://blog.csdn.net/javazejian/article/details/52247324
 */

public class BitmapDrawableActivity extends Activity implements AdapterView.OnItemSelectedListener {


    private ImageView iv_imageView;
    private Spinner spinnerStyle;
    private BitmapDrawable mBitmapDrawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmapdrawable);
        //把imageView设置成 android:scaleType="fitXY"就能看到效果了
        iv_imageView = (ImageView) findViewById(R.id.iv_imageView);
        spinnerStyle = (Spinner) findViewById(R.id.spinnerStyle);
        spinnerStyle.setOnItemSelectedListener(this);

        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lufei);
        mBitmapDrawable = new BitmapDrawable(getResources(), mBitmap);
        //mBitmapDrawable.setTileModeXY(Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);//平铺方式
        mBitmapDrawable.setAntiAlias(true);//抗锯齿
        mBitmapDrawable.setDither(true);//防抖动
        //默认是那种撑大效果
        //  iv_imageView.setImageDrawable(mBitmapDrawable);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0://case 0是默认第一次被执行的
                mBitmapDrawable.setTileModeXY(Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);
                iv_imageView.setImageDrawable(mBitmapDrawable);
                break;
            case 1:
                mBitmapDrawable.setTileModeXY(Shader.TileMode.MIRROR, Shader.TileMode.CLAMP);
                iv_imageView.setImageDrawable(mBitmapDrawable);
                break;
            case 2:
                mBitmapDrawable.setTileModeXY(Shader.TileMode.MIRROR, Shader.TileMode.REPEAT);
                iv_imageView.setImageDrawable(mBitmapDrawable);
                break;

           default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
