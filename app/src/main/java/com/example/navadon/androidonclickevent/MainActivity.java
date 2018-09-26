package com.example.navadon.androidonclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextBtn = findViewById(R.id.next);

    }

    public void next(View v){
        Intent intent = new Intent(this,Option0Activity.class);
        startActivity(intent);
    }
}
