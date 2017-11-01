package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.widget.ImageView;

import com.example.lurenman.drawabledemo.R;

/**
 * @author: baiyang.
 * Created on 2017/10/31.
 */

public class ShapeDrawableActivity extends Activity {
    private ImageView iv_imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }


    private void initView() {
        setContentView(R.layout.activity_shapedrawable);
        iv_imageView = (ImageView) findViewById(R.id.iv_imageView);
        //iv_imageView.setBackgroundResource(R.drawable.lufei);
//        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lufei);
//        iv_imageView.setImageBitmap(mBitmap);
    }
}
