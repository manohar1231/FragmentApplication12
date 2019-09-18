package com.example.dell.fragmentapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    String names[] = {"Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
            "Uday Harsha", "Ashok", "Manoher", "Nagarjuna",
    };

    ListView lv;

    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);

        lv = view.findViewById(R.id.listfra1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.select_dialog_item,
                names);
        lv.setAdapter(adapter);

        return view;
    }

}
