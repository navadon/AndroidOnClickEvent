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
    private Button btnNext;
    private Button btnBack;

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
        btnNext = findViewById(R.id.btn_next0);
        btnBack = findViewById(R.id.btn_back0);
    }

    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        // Do we really need to compare view objects?
        if (v == btnProcess) {
            greet();
        }
        else if (v == btnNext){
            Intent intent = new Intent(this,Option1Activity.class);
            startActivity(intent);
        }
        else if (v == btnBack){
            Intent intent = new Intent(this,Option5Activity.class);
            startActivity(intent);
        }
        hideKeyboardInput(v);

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
