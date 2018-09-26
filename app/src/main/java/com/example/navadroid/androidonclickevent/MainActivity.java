package com.example.navadroid.androidonclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn = (Button) findViewById(R.id.Start_btn);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOption0();
            }
        });
    }
    public void openOption0(){
        Intent intent = new Intent(this, Option0Activity.class);
        startActivity(intent);
    }
}
