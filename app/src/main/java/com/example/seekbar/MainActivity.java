package com.example.seekbar;

import android.widget.Chronometer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static java.sql.DriverManager.println;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chronometer chm=findViewById(R.id.chronometer);
        chm.start();
        for(int i=0;i<100;i++){
            println(String.valueOf(i));
        }

        boolean b=chm.isCountDown();


    }
}
