package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private int Splash_Screen = 3000;
    private ImageView LogoImg;
    private TextView Appname;
    private TextView Rights;

    private Animation topAnimation, leftAnimation, bottomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LogoImg = findViewById(R.id.clock);
        Appname = findViewById(R.id.name1);
        Rights = findViewById(R.id.allrights);


        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        leftAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        LogoImg.setAnimation(topAnimation);
        Appname.setAnimation(leftAnimation);
        Rights.setAnimation(bottomAnimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        },Splash_Screen);
    }
}