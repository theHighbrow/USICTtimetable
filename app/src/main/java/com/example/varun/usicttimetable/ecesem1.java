package com.example.varun.usicttimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class ecesem1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent ecesem1=getIntent();
        setContentView(R.layout.ecesem1);
        PhotoView photoView =  findViewById(R.id.ecesem1);
        photoView.setImageResource(R.drawable.ece1);
    }
}
