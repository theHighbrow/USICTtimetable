package com.example.varun.usicttimetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class itsem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itsem5);

        PhotoView photoView=findViewById(R.id.it5);
        photoView.setImageResource(R.drawable.it5);
    }
}
