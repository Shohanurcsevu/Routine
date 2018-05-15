package com.example.mdshohanurrahman.batchcommunity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TuesdayFragmnent extends Fragment {

    View view;
    TextView cse421;
    Dialog dialog421;
    Dialog dialog425;
    TextView cse425;


    public TuesdayFragmnent() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.tuesday_fragment,container,false);
        cse421=(TextView)view.findViewById(R.id.tucse421);
        cse425=(TextView)view.findViewById(R.id.tucse425);
        dialog425=new Dialog(getActivity());
        dialog421=new Dialog(getActivity());

        cse421.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog421.setContentView(R.layout.popupcse421);
                dialog421.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog421.show();
            }
        });

        cse425.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog425.setContentView(R.layout.popupcse425);
                dialog425.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog425.show();
            }
        });
        return view;
    }
}
