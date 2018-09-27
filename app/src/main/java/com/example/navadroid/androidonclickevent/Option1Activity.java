package com.example.navadroid.androidonclickevent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// TODO: XML onClick attribute & View id
public class Option1Activity extends AppCompatActivity {

    private EditText etInput;
    private TextView tvOutput;
    Button next;
    Button previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
        bindView();

        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNext();
            }
        });

        previous = (Button) findViewById(R.id.previous);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickPrevious();
            }
        });
    }

    public void onClickNext(){
        Intent it = new Intent(this, Option2Activity.class);
        startActivity(it);
    }

    public void onClickPrevious(){
        Intent it = new Intent(this, Option0Activity.class);
        startActivity(it);
    }

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
