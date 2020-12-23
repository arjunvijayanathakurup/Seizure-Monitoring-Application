package com.example.seizuremonitoringsystemepilepsy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomSeizureAdapter extends ArrayAdapter<Seizures> {
    private List<Seizures> seizuresList = new ArrayList<>();
    public CustomSeizureAdapter(Context context, int textViewResourceId, ArrayList<Seizures> list){
        super(context, 0, list);
        seizuresList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.custom_seizure_list, null);
        TextView date = (TextView)v.findViewById(R.id.seizure_date);
        TextView month = (TextView)v.findViewById(R.id.seizure_month);
        TextView seizure_ime = (TextView)v.findViewById(R.id.seizure_time);
        TextView seizure_occurance = (TextView)v.findViewById(R.id.seizure_occurance);
        ImageView severity = (ImageView)v.findViewById(R.id.severity);
        date.setText(seizuresList.get(position).getDate());
        month.setText(seizuresList.get(position).getMonth());
        String time = seizuresList.get(position).getTime_from() + " : " + seizuresList.get(position).getTime_to();
        seizure_ime.setText(time);
        seizure_occurance.setText(seizuresList.get(position).getMessage());
        severity.setImageResource(seizuresList.get(position).getSeverity_status());
        return v;

    }

}
