package com.example.user.a20181206;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    Button logbt;
    EditText pwed;
    EditText ided;

    View.OnClickListener clkick1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(AddActivity.this,AddresActivity.class);
            i.putExtra("ID",ided.getText().toString());
            i.putExtra("PWD",pwed.getText().toString());
            setResult(1,i);
            finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        logbt = findViewById(R.id.logbt);
        ided = findViewById(R.id.ided);
        pwed =findViewById(R.id.pwed);

        logbt.setOnClickListener(clkick1);

    }
}
