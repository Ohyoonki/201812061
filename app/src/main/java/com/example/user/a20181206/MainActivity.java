package com.example.user.a20181206;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button patch;
    Button abt;
    Button imbt;
    Button outbt;
    DrawerLayout dlayout;

    View.OnClickListener click6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,ImformActivity.class);
            startActivity(i);
        }
    };
    View.OnClickListener click7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.clear();
            editor.commit();
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);
            finish();
        }
    };

    View.OnClickListener click8 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,PatchActivity.class);
            startActivity(i);
        }
    };
    View.OnClickListener click9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i =new Intent(MainActivity.this,AddresActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        patch =findViewById(R.id.path);
        abt =findViewById(R.id.adbt);
        dlayout =findViewById(R.id.dlay);
        imbt = findViewById(R.id.imbt);
        outbt= findViewById(R.id.outbt);

        imbt.setOnClickListener(click6);
        outbt.setOnClickListener(click7);
        patch.setOnClickListener(click8);
        abt.setOnClickListener(click9);
    }
}
