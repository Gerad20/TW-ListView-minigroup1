package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;

    ArrayList<Module> moduley1 = new ArrayList<Module>(Arrays.asList(new Module("module1", R.drawable.prog), new Module("module2", R.drawable.nonprog), new Module("module3", R.drawable.prog)));
    ArrayList<Module> moduley2 = new ArrayList<Module>(Arrays.asList(new Module("C208", R.drawable.prog), new Module("C200", R.drawable.nonprog), new Module("C346", R.drawable.prog)));
    ArrayList<Module> moduley3 = new ArrayList<Module>(Arrays.asList(new Module("module4", R.drawable.prog), new Module("module5", R.drawable.nonprog), new Module("module6", R.drawable.prog)));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        if (year.equalsIgnoreCase("Year 1")) {
            ArrayAdapter adapter = new ModuleAdapter(this, R.layout.modulerow, moduley1);
            lv.setAdapter(adapter);
        } else if (year.equalsIgnoreCase("Year 2")) {
            ArrayAdapter adapter = new ModuleAdapter(this, R.layout.modulerow, moduley2);
            lv.setAdapter(adapter);
        } else if (year.equalsIgnoreCase("Year 3")) {
            ArrayAdapter adapter = new ModuleAdapter(this, R.layout.modulerow, moduley3);
            lv.setAdapter(adapter);
        }



    }



}
