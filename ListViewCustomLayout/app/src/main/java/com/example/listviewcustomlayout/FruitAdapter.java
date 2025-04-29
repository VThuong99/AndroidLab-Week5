package com.example.listviewcustomlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class FruitAdapter extends ArrayAdapter<Fruit> {
    private Context context;
    private List<Fruit> fruits;

    public FruitAdapter(Context context, List<Fruit> fruits) {
        super(context, 0, fruits);
        this.context = context;
        this.fruits = fruits;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.fruit_item, parent, false);
        }

        Fruit fruit = fruits.get(position);

        ImageView icon = convertView.findViewById(R.id.fruit_icon);
        TextView name = convertView.findViewById(R.id.fruit_name);
        TextView calories = convertView.findViewById(R.id.fruit_calories);

        icon.setImageResource(fruit.getIconId());
        name.setText(fruit.getName());
        calories.setText(fruit.getCalories());

        return convertView;
    }
}
