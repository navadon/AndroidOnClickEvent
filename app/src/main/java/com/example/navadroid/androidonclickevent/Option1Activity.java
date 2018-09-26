package com.example.kimbum.androidonclickevent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class Option1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
    }
    private EditText etInput;
    private TextView tvOutput;



    // To bind views to this activity
    private void bindView(){
        etInput = (EditText) findViewById(R.id.et_input_1);
        tvOutput = (TextView) findViewById(R.id.tv_body_1);
    }

    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        if(v.getId() == R.id.btn_process_1) {
            greet();
        }
        else if ( v.getId() == R.id.btn_back) {
            Back();

        }
        else if ( v.getId() == R.id.btn_next) {
            Next();

        }

        hideKeyboardInput(v);
    }

    private void Back() {
        Intent i  = new Intent(getApplicationContext(), com.example.kimbum.androidonclickevent.Option0Activity.class);
        startActivity(i);
    }

    private void Next() {
        Intent i  = new Intent(getApplicationContext(), Option2Activity.class);
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
