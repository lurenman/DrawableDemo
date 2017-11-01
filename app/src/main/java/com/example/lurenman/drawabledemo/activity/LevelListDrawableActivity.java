package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.lurenman.drawabledemo.R;

/**
 * @author: baiyang.
 * Created on 2017/11/1.
 */

public class LevelListDrawableActivity extends Activity {
    private static ImageView iv_imageView;
    private static Handler handler;
/*    private static Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                iv_imageView.getDrawable().setLevel(1);
            } else if (msg.what == 2) {
                iv_imageView.getDrawable().setLevel(2);
            }
        }
    };*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levelllstdrawable);
        iv_imageView = (ImageView) findViewById(R.id.iv_imageView);
        iv_imageView.setImageResource(R.drawable.level_list_drawable);
        iv_imageView.setImageLevel(0);
        //个人觉得这样写内存回收率会更高
        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 1) {
                    iv_imageView.getDrawable().setLevel(1);
                } else if (msg.what == 2) {
                    iv_imageView.getDrawable().setLevel(2);
                }
            }
        };

        for (int i = 1; i < 3; i++) {
            handler.sendEmptyMessageDelayed(i, i * 2000);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        iv_imageView = null;
        handler=null;
    }
}
