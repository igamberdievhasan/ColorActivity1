package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String[] color;
    LayoutInflater inflter;

    public ColorAdapter(Context context, String[] color) {
        this.context = context;
        this.color = color;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return color.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.list_view, null);
        TextView colorNames = (TextView) convertView.findViewById(R.id.textView);
        colorNames.setText(color[position]);
        colorNames.setBackgroundColor(Color.parseColor(color[position]));
        if(color[position].equals("Black")){
            colorNames.setTextColor(Color.WHITE);
        }
        return convertView;
    }
}
