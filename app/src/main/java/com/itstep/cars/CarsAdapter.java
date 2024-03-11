package com.itstep.cars;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarsViewHolder> {
    // Car[] (фиксирован размер)
    // ArrayList<Car>
    // List<Car> ?
    List<Car> cars; // Переменная в которой хранятся наши данные
    public CarsAdapter(List<Car> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Этот метод определяет какой xml-файл будет использован каждому элементу списка

        // Получить в виде java-объекта наш xml код
        View itemView = LayoutInflater    // Класс для превращения xml в java
                .from(parent.getContext())  // Указание контекста
                .inflate(R.layout.car_list_item, parent, false); // Операция превращения

        return new CarsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        // Этот метод соединяет данные с view holder-ом
        Car car = cars.get(position);
        holder.carTitle.setText(
                car.getBrand() + ", " + car.getModel()
                + "(" + car.getYear() + ")"
        );
        holder.carDescription.setText(car.getDescription());
        holder.carCost.setText("" + car.getCost());
        holder.carImage.setImageResource(car.getImageId());
    }

    @Override
    public int getItemCount() {
        // Этот метод определяет сколько предметов будет показано в RecyclerView
        return cars.size();
    }

    // Класс с элементами одной карточки
    public static class CarsViewHolder extends RecyclerView.ViewHolder {
        ImageView carImage;
        TextView carTitle;
        TextView carDescription;
        TextView carCost;

        public CarsViewHolder(@NonNull View itemView) {
            super(itemView);
            carImage = itemView.findViewById(R.id.carImage);
            carTitle = itemView.findViewById(R.id.carTitle);
            carDescription = itemView.findViewById(R.id.carDescription);
            carCost = itemView.findViewById(R.id.carCost);

        }
    }
}
