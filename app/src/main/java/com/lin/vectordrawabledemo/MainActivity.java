package com.lin.vectordrawabledemo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * VectorDrawable实现路径变换动画的兼容性问题，
    * 故路径变换动画目前存在兼容性问题。
    * 不能在4.X版本运行，这一点格外注意。
    */
    public void onClick(View view) {
        ImageView imageView = (ImageView) view;
//        AnimatedVectorDrawable vectorDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.fivestar_anim);
//        imageView.setImageDrawable(vectorDrawable);
//        if (vectorDrawable != null) vectorDrawable.start();

        Drawable drawable = imageView.getDrawable();

        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
