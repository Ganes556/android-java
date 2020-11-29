package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    private EditText inputName;
    private Button btnHide;
    private Button btnShow;
    @Override
    public boolean onLongClick(View v) {
        inputName = findViewById(R.id.inputName);
        btnShow = findViewById(R.id.show);
        btnHide = findViewById(R.id.hide);

        switch(v.getId()){
            case R.id.hide:
                inputName.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                btnHide.setVisibility(View.GONE);
                btnShow.setVisibility(View.VISIBLE);
                break;
            case R.id.show:
                inputName.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
                btnShow.setVisibility(View.GONE);
                btnHide.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.show);
        btnHide = findViewById(R.id.hide);

        btnShow.setOnLongClickListener(this);
        btnHide.setOnLongClickListener(this);
    }

    // Make button with initial in xml code
    public void btnClick(View view){
        inputName = findViewById(R.id.inputName);
        TextView helloText = findViewById(R.id.txtMessage);
        helloText.setText("Hello " + inputName.getText()); // dalam bentuk string
        // dalam bentuk tdk string tapi msih bsa jalan , bedanya tdak bsa di dalam var string
//        helloText.setText(inputName.getText()); --> bertipe EditText
    }
}