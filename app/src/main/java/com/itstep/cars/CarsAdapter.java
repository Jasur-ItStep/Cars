package com.itstep.cars;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarsViewHolder> {

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Этот метод определяет какой xml-файл будет использован каждому элементу списка
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        // Этот метод соединяет данные с xml-файлов
    }

    @Override
    public int getItemCount() {
        // Этот метод определяет сколько предметов будет показано в RecyclerView
        return 0;
    }

    // Класс с элементами одной карточки
    public static class CarsViewHolder extends RecyclerView.ViewHolder {
        public CarsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
