package com.example.listviewcustomlayout;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        List<Fruit> fruits = getFruits();
        FruitAdapter adapter = new FruitAdapter(this, fruits);
        listView.setAdapter(adapter);
    }

    private List<Fruit> getFruits() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Orange", "47 Calories", R.drawable.orange));
        fruits.add(new Fruit("Cherry", "50 Calories", R.drawable.cherry));
        fruits.add(new Fruit("Banana", "89 Calories", R.drawable.banana));
        fruits.add(new Fruit("Apple", "52 Calories", R.drawable.apple));
        fruits.add(new Fruit("Kiwi", "61 Calories", R.drawable.kiwi));
        fruits.add(new Fruit("Pear", "57 Calories", R.drawable.pear));
        fruits.add(new Fruit("Strawberry", "33 Calories", R.drawable.strawberry));
        fruits.add(new Fruit("Lemon", "29 Calories", R.drawable.lemon));
        fruits.add(new Fruit("Peach", "39 Calories", R.drawable.peach));
        fruits.add(new Fruit("Apricot", "48 Calories", R.drawable.apricot));
        fruits.add(new Fruit("Mango", "60 Calories", R.drawable.mango));
        return fruits;
    }
}