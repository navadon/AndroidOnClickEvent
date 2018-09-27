package com.example.navadroid.androidonclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn_next = (Button) findViewById(R.id.btn_next);

        this.btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Next();
            }
        });
    }

    public void Next(){
        Intent intentNext = new Intent(this, Option0Activity.class);
        startActivity(intentNext);
    }

}