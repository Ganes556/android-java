package com.example.uibasic;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Hello {
    public MainActivity app;
    Hello(MainActivity app){
        this.app = app;
    }
    public void onHelloBtnClicked(View view){
        TextView hello = app.findViewById(R.id.txtWelcome);
        hello.setText("hello");
    }


}
