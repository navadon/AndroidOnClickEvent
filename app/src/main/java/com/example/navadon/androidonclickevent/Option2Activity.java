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

// TODO: setOnClickListener to each view (use anonymous object of OnClickListener)
public class Option2Activity extends AppCompatActivity {

    private EditText etInput;
    private TextView tvOutput;
    private Button btnNext;
    private Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);
        bindView();
        initView();
    }

    private void bindView() {
        etInput = findViewById(R.id.et_input_2);
        tvOutput = findViewById(R.id.tv_body_2);
    }

    // To set onClickListener to "each" view (and use anonymous OnClickListener individually)
    // You don't have to bind any function to "android:onClick" in layout XML file.
    // However, this will cause adding too many instructions to activity's "onCreate" method.
    private void initView(){
        findViewById(R.id.btn_process_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greet();
                hideKeyboardInput(v);
            }
        });
        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Option2Activity.this,Option3Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_prev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Option2Activity.this,Option1Activity.class);
                startActivity(intent);
            }
        });
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
