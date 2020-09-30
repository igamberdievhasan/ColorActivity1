package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ListView simpleList;

    String [] color = {"Red","Yellow","Blue","Green","Gray","Magenta","Cyan","Black","Maroon","Olive"};

    int size = color.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ColorAdapter customAdapter = new ColorAdapter(getApplicationContext(),color);
        spinner.setAdapter(customAdapter);

        View background = findViewById(R.id.mainL);
        background.setBackgroundColor(Color.WHITE);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView colorNames = (TextView) view.findViewById(R.id.textView);
        colorNames.setText(color[position]);
        colorNames.setTextColor(Color.parseColor(color[position]));
        colorNames.setBackgroundColor(Color.WHITE);

        View background = findViewById(R.id.mainL);
        background.setBackgroundColor(Color.parseColor(color[position]));

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        View background = findViewById(R.id.mainL);
        background.setBackgroundColor(Color.WHITE);
    }
}
