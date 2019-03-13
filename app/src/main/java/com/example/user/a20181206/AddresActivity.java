package com.example.user.a20181206;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AddresActivity extends AppCompatActivity {

    ListView custom;
    List<item> list_data;
    CustomAdapter adapter;
    Button dadbt;
    Button doubt;
    final int request =11;

    View.OnClickListener click2 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(AddresActivity.this,AddActivity.class);
            startActivityForResult(i,request);
        }
    };
    View.OnClickListener click3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(list_data.size()>0){
                list_data.remove(0);
                adapter.notifyDataSetChanged();
            }
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Intent i =getIntent();
        String id = data.getStringExtra("ID");
        String pwd = data.getStringExtra("PWD");
        if (resultCode == 1){
            switch (requestCode){
                case 11:
                    list_data.add(new item(0,id,pwd));
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addres);

        dadbt= findViewById(R.id.dadbt);
        doubt= findViewById(R.id.doubt);
        custom = findViewById(R.id.listv);

        Intent i = getIntent();
        String id = i.getStringExtra("ID");
        String pw = i.getStringExtra("PWD");

        list_data =new ArrayList<>();
        list_data.add(new item(0,"abc","1234"));


        adapter =new CustomAdapter(this,list_data);

        custom.setAdapter(adapter);

        dadbt.setOnClickListener(click2);
        doubt.setOnClickListener(click3);
    }
}
