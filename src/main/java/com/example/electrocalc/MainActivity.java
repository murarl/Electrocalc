package com.example.electrocalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button cablerating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cablerating = (Button) findViewById(R.id.button_cr);
        cablerating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
