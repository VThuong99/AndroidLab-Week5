package com.example.listviewcustomlayout;

public class Fruit {
    private String name;
    private String calories;
    private int iconId;

    public Fruit(String name, String calories, int iconId) {
        this.name = name;
        this.calories = calories;
        this.iconId = iconId;
    }

    public String getName() { return name; }
    public String getCalories() { return calories; }
    public int getIconId() { return iconId; }
}
