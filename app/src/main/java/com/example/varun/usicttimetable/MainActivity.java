package com.example.varun.usicttimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView cse1sem=findViewById(R.id.csesem1);
        TextView cse3sem=findViewById(R.id.csesem3);
        TextView cse5sem=findViewById(R.id.csesem5);
        TextView ece5sem = findViewById(R.id.ecesem5);
        TextView it1sem=findViewById(R.id.itsem1);
        TextView it3sem=findViewById(R.id.itsem3);
        TextView it5sem=findViewById(R.id.itsem5);

        cse1sem.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent csesem1=new Intent(MainActivity.this,csesem1.class);
               startActivity(csesem1);
           }
       });
        cse3sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csesem3=new Intent(MainActivity.this,csesem3.class);
                startActivity(csesem3);

            }
        });
        cse5sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csesem5=new Intent(MainActivity.this,csesem5.class);
                startActivity(csesem5);
            }
        });





        ece5sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ece5sem = new Intent(MainActivity.this,ecesem5.class);
                startActivity(ece5sem);
            }
        });

        it1sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1sem =new Intent(MainActivity.this,itsem1.class);
                startActivity(it1sem);
            }
        });
        it3sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it3sem =new Intent(MainActivity.this,itsem3.class);
                startActivity(it3sem);
            }
        });
        it5sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it5sem =new Intent(MainActivity.this,itsem5.class);
                startActivity(it5sem);
            }
        });
    }

    public void ecesem1(View view) {
        Intent ecesem1 = new Intent(MainActivity.this,ecesem1.class);
        startActivity(ecesem1);
    }

    public void ecesem3(View view) {
        Intent ecesem3 = new Intent(MainActivity.this,ecesem3.class);
        startActivity(ecesem3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info:
                Intent intent =new Intent(MainActivity.this,info.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
