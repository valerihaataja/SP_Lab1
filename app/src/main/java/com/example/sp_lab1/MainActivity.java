package com.example.sp_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MyThreadClass thread = new MyThreadClass();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        findViewById(R.id.start_button).setOnClickListener(this);
        findViewById(R.id.stop_button).setOnClickListener(this);
        findViewById(R.id.quit_button).setOnClickListener(this);
        textView = findViewById(R.id.text_field);

    }

    @Override
    public void onClick(View v) {
        int btnID = v.getId();

        if(btnID == R.id.start_button){
            thread.start();
        }
    }
    public void setTextToField(){
        textView.setText("Tiisu we want more!");
    }
}
