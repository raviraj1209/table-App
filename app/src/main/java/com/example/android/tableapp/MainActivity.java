package com.example.android.tableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button ;
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText ;
                editText = findViewById(R.id.bhk);
                int a = Integer.parseInt(editText.getText().toString());
                TextView text;
                text = findViewById(R.id.textView3);
                text.setText(a + " * 1 = " + a + "\n" + a + " * 2 = " + a*2 + "\n" + a + " * 3 = " + a*3 + "\n" + a + " * 4 = " + a*4 + "\n" + a + " * 5 = " + a*5 + "\n" + a + " * 6 = " + a*6 + "\n" + a + " * 7 = " + a*7 + "\n" + a + " * 8 = " + a*8 + "\n" +a + " * 9 = " + a*9 + "\n" + a + "*  10 = " + a*10);

            }
        });

    }
}