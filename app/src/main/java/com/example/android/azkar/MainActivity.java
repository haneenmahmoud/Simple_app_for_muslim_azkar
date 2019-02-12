package com.example.android.azkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void azkarElsabah(View view){
        Intent i = new Intent(this,azkar_elsaba7.class);
        startActivity(i);
    }

    public void azkarElmsaa(View view){
        Intent i = new Intent(this,azkar_elmsaa.class);
        startActivity(i);
    }

    public void azkarelnom(View view){
        Intent i = new Intent(this,azkar_elnom.class);
        startActivity(i);
    }

    public void azkar_elsalh(View view){
       Intent i = new Intent(this,azkar_elsalah.class);
       startActivity(i);

    }

    public void doaa(View view){
        Intent i = new Intent(this , azkar_elsfr.class);
        startActivity(i);
    }
}
