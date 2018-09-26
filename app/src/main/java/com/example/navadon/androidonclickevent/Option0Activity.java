package com.example.navadon.androidonclickevent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// TODO: XML onClick attribute and selecting view by comparing object
public class Option0Activity extends AppCompatActivity {

    private EditText etInput;
    private TextView tvOutput;
    private Button btnProcess;
    private Button btnPrev;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option0);
        bindView();
    }

    private void bindView() {
        etInput = findViewById(R.id.et_input_0);
        tvOutput = findViewById(R.id.tv_body_0);
        btnProcess = findViewById(R.id.btn_process_0);
        btnPrev = findViewById(R.id.btn_prev_0);
        btnNext = findViewById(R.id.btn_next_0);
    }

    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        // Do we really need to compare view objects?
        if (v == btnProcess) {
            greet();
        }else if(v == btnPrev){
            prev();
        }
        else if(v == btnNext){
            next();
        }
        hideKeyboardInput(v);
    }

    // To greet the user
    private void greet(){
        tvOutput.setText(getString(R.string.greeting) + " " + etInput.getText().toString());
    }

    public void prev() {
        Intent myIntent = new Intent(Option0Activity.this, Option5Activity.class);
        Option0Activity.this.startActivity(myIntent);
    }

    public void next() {
        Intent myIntent = new Intent(Option0Activity.this, Option1Activity.class);
        Option0Activity.this.startActivity(myIntent);
    }

    // To hide Android soft keyboard
    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
