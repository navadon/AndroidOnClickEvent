package com.example.navadon.androidonclickevent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

// TODO: Implementing View.OnClickListener to Activity and selecting view via id
// This activity is implementing "View.OnClickListener" interface, so "onClick" method must be overridden.

public class Option3Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText etInput;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option3);
        bindView();
        initView();
    }

    // To bind views to this activity
    private void bindView(){
        etInput = findViewById(R.id.et_input_3);
        tvOutput = findViewById(R.id.tv_body_3);
    }

    private void initView(){
        // To register click event to view
        findViewById(R.id.btn_process_3).setOnClickListener(this); // Think about... Who is "this"?
    }

    // This onClick method is overridden from "View.OnClickListener".
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_process_3:
                greet();
                break;
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

    public void Back(View view) {
        Intent intent = new Intent(this, Option2Activity.class);
        startActivity(intent);
        finish();
    }

    public void Next(View view) {
        Intent intent = new Intent(this, Option4Activity.class);
        startActivity(intent);
        finish();
    }
}
