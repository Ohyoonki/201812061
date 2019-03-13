package com.example.user.a20181206;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText ided;
    EditText psed;
    Button lgbt;

    View.OnClickListener click5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putString("id",ided.getText().toString());
            ed.putString("pwd",psed.getText().toString());
            ed.commit();

            Intent i =new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ided =findViewById(R.id.ided);
        psed =findViewById(R.id.psed);
        lgbt =findViewById(R.id.lgbt);

        lgbt.setOnClickListener(click5);
    }
}
