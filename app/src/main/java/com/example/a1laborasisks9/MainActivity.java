package com.example.a1laborasisks9;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

    private TextView tvMain;
    private Button btnChangeColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        btnChangeColor = (Button) findViewById(R.id.btnChangeColor);
    }

    public void onBtnChangeTextClick(View view) {
    this.tvMain.setText("Text was changed");
    }

    public void onBtnChangeTextColor(View arg0) {
        tvMain.setTextColor(Color.RED);
    }
}