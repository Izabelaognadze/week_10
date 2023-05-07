package com.example.week_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button ibsu;
    Button tsu;
    Button gau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
        ibsu = findViewById(R.id.ibsu);

        ibsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibsu = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ibsu.edu.ge/ge/"));
                startActivities(ibsu);
                Toast.makeText(MainActivity.this, "clicked ibsu website", Toast.LENGTH_SHORT).show();
            }

            private void startActivities(Intent ibsu) {
            }
        });
        gau = findViewById(R.id.gau);

        gau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gau = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gau.edu.ge/ka"));
                startActivities(gau);
                Toast.makeText(MainActivity.this, "clicked gau website", Toast.LENGTH_SHORT).show();
            }

            private void startActivities(Intent gau) {
            }
        });
        tsu = findViewById(R.id.tsu);

        tsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tsu = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tsu.ge/"));
                startActivities(tsu);
                Toast.makeText(MainActivity.this, "clicked tsu website", Toast.LENGTH_SHORT).show();
            }

            private void startActivities(Intent tsu) {
            }
        });
    }
    public void callSecondActivity(View view){
        setContentView(R.layout.activity_main);
        Intent btn = new Intent(MainActivity.this,
                btn.class);
        startActivity(btn);
        Toast.makeText(MainActivity.this, "clicked button", Toast.LENGTH_SHORT).show();
    }
    
}