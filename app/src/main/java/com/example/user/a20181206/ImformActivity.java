package com.example.user.a20181206;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ImformActivity extends AppCompatActivity {

    TextView idtx;
    TextView pwtx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imform);

        idtx=findViewById(R.id.idtx);
        pwtx=findViewById(R.id.pwtx);

        SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
        String id =sp.getString("id","");
        String pw = sp.getString("pwd","");

        idtx.setText("id:"+id);
        pwtx.setText("pw:"+pw);
    }
}
