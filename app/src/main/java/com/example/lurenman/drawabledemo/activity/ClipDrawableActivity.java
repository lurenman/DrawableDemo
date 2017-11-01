package com.example.lurenman.drawabledemo.activity;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.lurenman.drawabledemo.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: baiyang.
 * Created on 2017/11/1.
 */

public class ClipDrawableActivity extends Activity {
    private ImageView clipImage;
    private ImageView clipImage1;
    private final static int IS_CONTUNUE=0x22;
    private  ClipDrawable drawable;
    private Timer timer = new Timer();

    final Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            if (msg.what == IS_CONTUNUE) {
                /**setlevel()设置图片截取的大小
                 * 修改ClipDrawable的level值，level值为0--10000；
                 * 10000：截取图片大小为空白，0：截取图片为整张图片；
                 */
                drawable.setLevel(drawable.getLevel() + 200);
            }
        }

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipdrawable);
        clipImage = (ImageView) findViewById(R.id.clipImage);
        clipImage1 = (ImageView) findViewById(R.id.clipImage1);
/*         因为这里我们在xml引用时设置的是背景图所以使用clipImage.getBackground()，
        如果在xml引用时使用的是src，那么就使用clipImage.getDrawable()即可。
        前面我们已经提到过，ClipDrawable的等级范围是[0,10000]，而且level越大裁剪区域越少，当level=10000时，
        表示不裁剪，我们在这里设置了level为6000则表示裁剪40%的区域*/
        ClipDrawable clip= (ClipDrawable) clipImage.getBackground();
        clip.setLevel(6000);


        //获取图片所显示的ClipDrawable对象
        drawable = (ClipDrawable)clipImage1.getDrawable();
        //定时器
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                Message msg = new Message();
                msg.what = IS_CONTUNUE;
                handler.sendMessage(msg);
                if (drawable.getLevel() >= 10000) {
                    timer.cancel();
                }
            }
        }, 0, 200);
    }
}
