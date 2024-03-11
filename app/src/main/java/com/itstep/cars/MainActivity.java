package com.itstep.cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/*
1. Добавить сам RecyclerView и получить его.
2. Создать xml для одного предмета списка.
3. Создать адаптер для RecyclerView.
*/

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView openSearchActivityBtn = findViewById(R.id.openSearchActivity);
        recyclerView = findViewById(R.id.carsList);

        openSearchActivityBtn.setOnClickListener(view -> {
            // Открываем второе окно (Intent - намерение, что-то сделать системное)
            Intent intent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent);
            finish();
        });
    }
}