package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.lurenman.drawabledemo.R;

/**
 * @author: baiyang.
 * Created on 2017/11/1.
 */

public class ColorDrawableActivity extends Activity
{
    private ImageView iv_imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colordrawable);
        iv_imageView = (ImageView) findViewById(R.id.iv_imageView);
        ColorDrawable cd = new ColorDrawable(0xff000000);
        iv_imageView.setImageDrawable(cd);
    }
}
