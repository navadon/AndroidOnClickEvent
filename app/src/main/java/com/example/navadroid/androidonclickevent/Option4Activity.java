package com.example.kimbum.androidonclickevent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class Option4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option4);
    }
    private EditText etInput;
    private TextView tvOutput;
    private View.OnClickListener onClickListener;


    // To bind views to this activity
    private void bindView(){
        etInput = (EditText) findViewById(R.id.et_input_4);
        tvOutput = (TextView) findViewById(R.id.tv_body_4);
    }

    private void initView(){
        initOnClickListener();
        // To register click event to view
        findViewById(R.id.btn_process_4).setOnClickListener(onClickListener);
        findViewById(R.id.btn_back).setOnClickListener(onClickListener);
        findViewById(R.id.btn_next).setOnClickListener(onClickListener);
    }

    // You don't have to bind any functions to "android:onClick" in layout XML file.
    private void initOnClickListener(){

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_process_4:
                        greet();
                        break;
                    case R.id.btn_back:
                        Back();
                        break;
                    case R.id.btn_next:
                        Next();
                        break;

                }
                hideKeyboardInput(v);
            }


        };
    }

    private void Back() {
        Intent i  = new Intent(getApplicationContext(), com.example.kimbum.androidonclickevent.Option3Activity.class);
        startActivity(i);
    }

    private void Next() {
        Intent i  = new Intent(getApplicationContext(), Option5Activity.class);
        startActivity(i);
    }

    // To greet the user
    private void greet(){
        tvOutput.setText(getString(R.string.greeting) + " " + etInput.getText().toString());
    }

    // To hide Android soft keyboard
    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
