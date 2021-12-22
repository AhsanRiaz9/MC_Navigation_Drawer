package com.example.mc_navigation_drawer;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Toast.makeText(getApplicationContext(),"Retur is Clicked",Toast.LENGTH_LONG).show();

    }
}
