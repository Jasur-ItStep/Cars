package com.itstep.cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/*
1. Добавить сам RecyclerView и получить его.
2. Создать xml для одного предмета списка.
3. Создать адаптер для RecyclerView.
3.1. Определить метод onCreateViewHolder
3.2. Определить метод onBindViewHolder
3.3. Определить метод getItemCount
4. Создать класс View Holder

*/

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CarsAdapter carsAdapter;

    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainApp = (MainApp) getApplication();
        carsAdapter = new CarsAdapter(mainApp.getCarsList()); // Создаем адаптер

        ImageView openSearchActivityBtn = findViewById(R.id.openSearchActivity);
        recyclerView = findViewById(R.id.carsList);
        recyclerView.setAdapter(carsAdapter); // Установка адаптера списку
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Установка структуры recycler view

        openSearchActivityBtn.setOnClickListener(view -> {
            // Открываем второе окно (Intent - намерение, что-то сделать системное)
            Intent intent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent);
            finish();
        });
    }
}