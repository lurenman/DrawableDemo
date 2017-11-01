package com.example.lurenman.drawabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lurenman.drawabledemo.activity.BitmapDrawableActivity;
import com.example.lurenman.drawabledemo.activity.ClipDrawableActivity;
import com.example.lurenman.drawabledemo.activity.ColorDrawableActivity;
import com.example.lurenman.drawabledemo.activity.InsetDrawableActivity;
import com.example.lurenman.drawabledemo.activity.LayerDrawableActivity;
import com.example.lurenman.drawabledemo.activity.LevelListDrawableActivity;
import com.example.lurenman.drawabledemo.activity.ScaleDrawableActivity;
import com.example.lurenman.drawabledemo.activity.ShapeDrawableActivity;
import com.example.lurenman.drawabledemo.activity.TransitionDrawableActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_BitmapDrawable;
    private Button bt_ShapeDrawable;
    private Button bt_LayerDrawable;
    private Button bt_LevelListDrawable;
    private Button bt_TransitionDrawable;
    private Button bt_InsetDrawable;
    private Button bt_ScaleDrawable;
    private Button bt_ClipDrawable;
    private Button bt_ColorDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_BitmapDrawable = (Button) findViewById(R.id.bt_BitmapDrawable);
        bt_ShapeDrawable = (Button) findViewById(R.id.bt_ShapeDrawable);
        bt_LayerDrawable = (Button) findViewById(R.id.bt_LayerDrawable);
        bt_LevelListDrawable = (Button) findViewById(R.id.bt_LevelListDrawable);
        bt_TransitionDrawable = (Button) findViewById(R.id.bt_TransitionDrawable);
        bt_InsetDrawable = (Button) findViewById(R.id.bt_InsetDrawable);
        bt_ScaleDrawable = (Button) findViewById(R.id.bt_ScaleDrawable);
        bt_ClipDrawable = (Button) findViewById(R.id.bt_ClipDrawable);
        bt_ColorDrawable = (Button) findViewById(R.id.bt_ColorDrawable);
        bt_BitmapDrawable.setOnClickListener(this);
        bt_ShapeDrawable.setOnClickListener(this);
        bt_LayerDrawable.setOnClickListener(this);
        bt_LevelListDrawable.setOnClickListener(this);
        bt_TransitionDrawable.setOnClickListener(this);
        bt_InsetDrawable.setOnClickListener(this);
        bt_ScaleDrawable.setOnClickListener(this);
        bt_ClipDrawable.setOnClickListener(this);
        bt_ColorDrawable.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==bt_BitmapDrawable)
        {
            Intent intent = new Intent(MainActivity.this, BitmapDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_ShapeDrawable)
        {
            Intent intent = new Intent(MainActivity.this, ShapeDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_LayerDrawable)
        {
            Intent intent = new Intent(MainActivity.this, LayerDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_LevelListDrawable)
        {
            Intent intent = new Intent(MainActivity.this, LevelListDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_TransitionDrawable)
        {
            Intent intent = new Intent(MainActivity.this, TransitionDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_InsetDrawable)
        {
            Intent intent = new Intent(MainActivity.this, InsetDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_ScaleDrawable)
        {
            Intent intent = new Intent(MainActivity.this, ScaleDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_ClipDrawable)
        {
            Intent intent = new Intent(MainActivity.this, ClipDrawableActivity.class);
            startActivity(intent);
        }
        if (view==bt_ColorDrawable)
        {
            Intent intent = new Intent(MainActivity.this, ColorDrawableActivity.class);
            startActivity(intent);
        }

    }
}
