package com.wq.blokish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wq.blokish.R;

public class MainActivity extends AppCompatActivity {

    Button button_start;
    Button button_help;
    Button button_set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uistart);

        button_help = (Button) findViewById(R.id.button_help);
        button_set = (Button) findViewById(R.id.button_set);
        button_start = (Button) findViewById(R.id.button_start);

        button_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Help.class);
                startActivity(intent);
            }


        });


        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, UI.class);
                startActivity(intent);
            }


        });

    }
}