package com.example.uibasicsection2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener{
    // every UI element is a view like textviews, edittext, etc

    private EditText editText;
    private TextView textView;

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnHello:
                // will make toast message (toast message --> pesan kecil yang keluar di bawah layar)
                textView.setText("Hello " + editText.getText().toString());
                break;
            case R.id.editText:
                Toast.makeText(this, "Edit the text", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
    // TODO Switch button
    // switch button for change color
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // Get Id
        final RelativeLayout layout = findViewById(R.id.lyout);
        final EditText editText = findViewById(R.id.editText);
        // checked true and false for change background theme
        if(isChecked){
            editText.setTextColor(Color.parseColor("#FFFFFF"));
            layout.setBackgroundColor(Color.parseColor("#000000"));

        }else{
            editText.setTextColor(Color.parseColor("#000000"));
            layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // defined switch and button
        Button btnHello = findViewById(R.id.btnHello);
        Switch swtchTogle = findViewById(R.id.swtchTogle);

        btnHello.setOnClickListener(this);
        swtchTogle.setOnCheckedChangeListener(this);

        // edited variable in this class
        editText = findViewById(R.id.editText);
        // make appear toast text when click the editText
        editText.setOnClickListener(this);
        textView = findViewById(R.id.textView);

        // make hold button or long click button without make implement in class
            //   TODO hold button

            //        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            //            @Override
            //            public boolean onLongClick(View v) {
            //                RelativeLayout layout = findViewById(R.id.lyout);
            //                Toast.makeText(MainActivity.this, "Background Dark Theme", Toast.LENGTH_LONG).show();
            //                return true;
            //            }
            //        });


    }
}