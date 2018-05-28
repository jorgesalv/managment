package com.example.jorge.smartpills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {

    EditText name;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        name = findViewById(R.id.editText);
        submit = findViewById(R.id.button);

        String nameToDb = name.getText().toString();
        //insert nameToDb

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Welcome.this, CalendarActivity.class);
                startActivity(homeIntent);
                //Transition Animation
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Different type of animations
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                //overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
                //overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
                finish();
            }
        });
    }
}
