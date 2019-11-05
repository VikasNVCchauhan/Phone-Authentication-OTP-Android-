package com.phoneauthentication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Savedata extends AppCompatActivity implements View.OnClickListener {
    Button save;
    EditText enterNumber,enterPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        save = findViewById(R.id.save);
        enterNumber = findViewById(R.id.mobile);
        enterPassword = findViewById(R.id.password);

        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==save)
        {

        }
    }
}
