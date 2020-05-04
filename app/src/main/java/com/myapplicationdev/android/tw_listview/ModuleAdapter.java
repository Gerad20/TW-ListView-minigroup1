package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> Module;
    private Context context;
    private TextView tvModule;
    private ImageView ivModule;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);
        Module = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.modulerow, parent, false);
        tvModule = (TextView)rowView.findViewById(R.id.tvModule);
        ivModule = (ImageView)rowView.findViewById(R.id.ivModule);

        Module currentmodule = Module.get(position);
        tvModule.setText(currentmodule.getName());
        ivModule.setImageResource(currentmodule.getImage());

        return rowView;

    }



}
