package com.example.varun.usicttimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class ecesem3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecesem3);
        PhotoView photoView =  findViewById(R.id.ecesem3);
        photoView.setImageResource(R.drawable.ece3sem);
    }
}
