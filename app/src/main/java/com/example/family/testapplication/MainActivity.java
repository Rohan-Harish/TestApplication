package com.example.family.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        make_screen();
    }

    public void make_screen()
    {
        final Button button2 = findViewById(R.id.button2);
        final Button button = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                button.setVisibility(View.VISIBLE);
                button2.setVisibility(View.INVISIBLE)
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.VISIBLE);
            }
        });

    }

}
