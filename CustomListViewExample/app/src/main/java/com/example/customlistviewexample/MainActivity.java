package com.example.customlistviewexample;

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

        List<AndroidVersion> versions = getAndroidVersions();

        AndroidVersionAdapter adapter = new AndroidVersionAdapter(this, versions);

        listView.setAdapter(adapter);
    }

    private List<AndroidVersion> getAndroidVersions() {
        List<AndroidVersion> versions = new ArrayList<>();
        versions.add(new AndroidVersion("Android Cupcake", "1.5", R.drawable.cupcake));
        versions.add(new AndroidVersion("Android Donut", "1.6", R.drawable.donut));
        versions.add(new AndroidVersion("Android Eclair", "2.0/2.1", R.drawable.eclair));
        versions.add(new AndroidVersion("Android Froyo", "2.2", R.drawable.froyo));
        versions.add(new AndroidVersion("Android Gingerbread", "2.3", R.drawable.gingerbread));
        versions.add(new AndroidVersion("Android Honeycomb", "3.0", R.drawable.honeycomb));
        return versions;
    }
}