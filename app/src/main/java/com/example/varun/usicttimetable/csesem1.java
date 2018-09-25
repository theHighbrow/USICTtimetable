package com.example.varun.usicttimetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class csesem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csesem1);

        PhotoView photoView=findViewById(R.id.cse1);
        photoView.setImageResource(R.drawable.cse1);
    }
}
