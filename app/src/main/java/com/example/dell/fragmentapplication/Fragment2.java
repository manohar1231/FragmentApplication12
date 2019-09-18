package com.example.dell.fragmentapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

GridView gv;
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

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2, container, false);
        gv = view.findViewById(R.id.gridfra2);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.select_dialog_item,
                names);
        gv.setAdapter(adapter);

        return view;
    }

}
