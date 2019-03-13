package com.example.user.a20181206;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp =getSharedPreferences("login",MODE_PRIVATE);
                String str = sp.getString("id","");
                if (str.equals("")) {
                    startActivity(new Intent(IntroActivity.this,LoginActivity.class));
                    finish();
                }else {startActivity(new Intent(IntroActivity.this, MainActivity.class));
                    finish();
                }
            }
        }, 3000);
    }
}
