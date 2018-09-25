package com.example.varun.usicttimetable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class ecesem5 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecesem5);

        PhotoView photoView=findViewById(R.id.ece5PhotoView);
        photoView.setImageResource(R.drawable.ece5);

    }
}
