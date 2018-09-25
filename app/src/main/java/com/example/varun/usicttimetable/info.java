package com.example.varun.usicttimetable;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

    }

    public void github(View view) {
        String url="https://github.com/Varunsonava/USICTtimetable";
        Intent myIntent= new Intent(Intent.ACTION_VIEW);
        myIntent.setData(Uri.parse(url));
        startActivity(myIntent);
    }

    public void gmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "varunsonava@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback and Suggestions for the TimeTable App");
        this.startActivity(Intent.createChooser(emailIntent, null));
    }
}
