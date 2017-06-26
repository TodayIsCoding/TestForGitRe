package com.example.coolweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 10;
        int b = 2;
    }

    public void showToast(View view) {
        Toast.makeText(this, "添加一个吐司111", Toast.LENGTH_SHORT).show();
    }
}
