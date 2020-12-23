package com.example.seizuremonitoringsystemepilepsy;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class SeizureList extends Fragment {
    private ListView listView;
    private ArrayList<Seizures> seizureItem;
    private CustomSeizureAdapter customSeizureAdapter;
    private String MESSAGE = "Seizure Occurrence";
    private  String NONMESSAGE = "No Seizures";
    public SeizureList() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        seizureItem = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_seizure_list, container, false);
        listView = (ListView)rootView.findViewById(R.id.list);
//        seizureItem.add(new Seizures(R.drawable.red, "01", "Jan", "00:00", "00:00", NONMESSAGE));
        seizureItem.add(new Seizures(R.drawable.red, "01", "Dec", "19:20", "19:40", MESSAGE));
        seizureItem.add(new Seizures(R.drawable.yellow, "05", "Jan", "10:20", "10:30", MESSAGE));
//        seizureItem.add(new Seizures(R.drawable.green, "06", "Feb", "04:20", "04:22", MESSAGE));
//        seizureItem.add(new Seizures(R.drawable.red, "07", "Mar", "07:20", "07:40", MESSAGE));
//        seizureItem.add(new Seizures(R.drawable.yellow, "18", "Apr", "22:20", "22:30", MESSAGE));
//        seizureItem.add(new Seizures(R.drawable.green, "22", "May", "23:20", "23:22", MESSAGE));
        customSeizureAdapter = new CustomSeizureAdapter(getActivity(), R.layout.custom_seizure_list, seizureItem);
        listView.setAdapter(customSeizureAdapter);
        return rootView;
    }
}