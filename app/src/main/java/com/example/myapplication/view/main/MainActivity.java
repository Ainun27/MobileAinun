package com.example.myapplication.view.main;

import android.content.Intent;
import android.os.Bundle;
import com.example.myapplication.R;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.myapplication.view.history.HistoryActivity;
import com.example.myapplication.view.input.DataKapalActivity;
import com.example.myapplication.view.input.DataKeretaActivity;
import com.example.myapplication.view.input.DataPesawatActivity;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imageProfile).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.cvKapal).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DataKapalActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.cvPesawat).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DataPesawatActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.cvKereta).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DataKeretaActivity.class);
            startActivity(intent);
        });
    }
}
