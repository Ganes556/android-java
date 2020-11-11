package com.example.challenge_register;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
    

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickBtn(View view){

        // input view
        EditText inputFirstName = findViewById(R.id.inputFirstName);
        EditText inputLastName = findViewById(R.id.inputLastName);
        EditText inputEmail = findViewById(R.id.inputEmail);

        // Text View
        TextView firstName = findViewById(R.id.txtFirst);
        TextView lastName = findViewById(R.id.txtLast);
        TextView email = findViewById(R.id.textEmail);

        // getString(R.string.name) untuk mengambil isi strings folder res.values.strings.xml
        // bisa menggunakan penambahan string secara manual
        firstName.setText(getString(R.string.first) + inputFirstName.getText());
        lastName.setText(getString(R.string.last) + inputLastName.getText());
        email.setText(getString(R.string.email) + inputEmail.getText());

        // change fonts email TextView from java code
        Typeface syneTactile_Regular = Typeface.createFromAsset(getAssets(), "fonts/syneTactile-Regular.ttf");
        Typeface oswald = Typeface.createFromAsset(getAssets(), "fonts/oswald.ttf");
        firstName.setTypeface(syneTactile_Regular);
        email.setTypeface(oswald);

    }

}
