package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.lurenman.drawabledemo.R;

/**
 * @author: baiyang.
 * Created on 2017/11/1.
 */

public class ScaleDrawableActivity extends Activity {
    private ImageView iv_imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scaledrawable);
        iv_imageView = (ImageView) findViewById(R.id.iv_imageView);
      /*  必须给ScaleDrawable设置一个大于0小于10000的等级（级别越大Drawable显示得越大，等级为10000时就没有缩放效果了），
        否则将无法正常显示。*/
        ScaleDrawable scale= (ScaleDrawable)iv_imageView.getBackground();
        scale.setLevel(1);

    }
}
