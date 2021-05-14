package com.example.a5androidactivityfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = getIntent();
        if (i!=null){
            TextView tv = (TextView) findViewById(R.id.tvAct2);
            tv.setText(i.getStringExtra("key_1"));
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}