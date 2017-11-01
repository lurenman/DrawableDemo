package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lurenman.drawabledemo.R;

/**
 * @author: baiyang.
 * Created on 2017/11/1.
 */

public class TransitionDrawableActivity extends Activity {
    private ImageView iv_imageView;
    private Button bt_click;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transitiondrawable);
        iv_imageView = (ImageView) findViewById(R.id.iv_imageView);
        bt_click = (Button) findViewById(R.id.bt_click);
        //代码方式实现
/*        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(), R.drawable.pager0);
        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(), R.drawable.pager1);
        //Bitmap bitmap3= BitmapFactory.decodeResource(getResources(), R.drawable.pager2);
        final TransitionDrawable td = new TransitionDrawable(new Drawable[] {  new BitmapDrawable(getResources(), bitmap1),
                new BitmapDrawable(getResources(), bitmap2)});
        iv_imageView.setImageDrawable(td);
        td.startTransition(4000);*/
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // iv_imageView.getDrawable()得到的是android：src中的Drawable，如果是android:background=""则得不到
                TransitionDrawable drawable = (TransitionDrawable) iv_imageView.getDrawable();
                drawable.startTransition(2000);
            }
        });

    }
}
