package com.example.customlistviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AndroidVersionAdapter extends ArrayAdapter<AndroidVersion> {

    private Context context;
    private List<AndroidVersion> versions;

    public AndroidVersionAdapter(Context context, List<AndroidVersion> versions) {
        super(context, 0, versions);
        this.context = context;
        this.versions = versions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        AndroidVersion version = getItem(position);

        ImageView icon = convertView.findViewById(R.id.icon);
        TextView name = convertView.findViewById(R.id.version_name);
        TextView number = convertView.findViewById(R.id.version_number);


        if (version != null) {
            icon.setImageResource(version.getIconId());
            name.setText(version.getName());
            number.setText(version.getVersion());
        }

        return convertView;
    }
}
