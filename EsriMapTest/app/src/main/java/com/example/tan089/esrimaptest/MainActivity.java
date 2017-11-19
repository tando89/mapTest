package com.example.tan089.esrimaptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button MapBnt, Map2Bnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapBnt = (Button) findViewById(R.id.mapActivity);

        Map2Bnt = (Button) findViewById(R.id.map2Activity);

        MapBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Map.class);
                startActivity(intent);
            }
        });
        Map2Bnt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, Map2Activity.class);
                 startActivity(intent);
             }
        });
    }
}
