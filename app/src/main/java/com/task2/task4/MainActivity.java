package com.task2.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button button;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Enjoy Exploring!", Toast.LENGTH_SHORT).show();
     Intent clubs = new Intent(MainActivity.this,Clubs.class);
startActivity(clubs);

    }
});
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Enjoy Learning!", Toast.LENGTH_SHORT).show();
                Intent material = new Intent(MainActivity.this,verynew.class);
                startActivity(material);
            }
        });
    }
}