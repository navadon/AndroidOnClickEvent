package com.example.navadon.androidonclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    private void bindView() {
        btnNext = findViewById(R.id.btnNext);
    }

    public void process(View v) {
        // Do we really need to compare view objects?
        if (v == btnNext) {
            goNext();
        }
    }

    private void goNext(){
        startActivity(new Intent(this, Option0Activity.class));
    }


}
