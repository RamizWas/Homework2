package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hobbies;
    EditText writeHoobbies;
    TextView bio;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hobbies= findViewById(R.id.hobbies);
        bio=findViewById(R.id.Bio);
        bio.setMovementMethod(new ScrollingMovementMethod());
        writeHoobbies=findViewById(R.id.writeHobbies);

    }

    public void AddHobby(View view) {
        hobbies.setVisibility(View.VISIBLE);
        hobbies.setText(writeHoobbies.getText().toString());



    }
}