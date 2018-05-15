package com.example.mdshohanurrahman.batchcommunity;

import android.app.Dialog;
import android.content.Intent;
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

public class SundayFragment extends Fragment implements View.OnClickListener {

    View view;
    Dialog mydialog;
    Dialog mydialogcse426;
    TextView tv1;
    TextView cse426;





    public SundayFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.sunday_fragment,container,false);
        tv1=(TextView)view.findViewById(R.id.cse423);
        cse426=(TextView)view.findViewById(R.id.cse426);

        mydialog=new Dialog(getActivity());
        mydialogcse426=new Dialog(getActivity());
        tv1.setOnClickListener(this);
        cse426.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialogcse426.setContentView(R.layout.popupcse426);
                mydialogcse426.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mydialogcse426.show();

            }
        });




        return view;
    }





    @Override
    public void onClick(View v) {
        mydialog.setContentView(R.layout.popupcse423);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();


    }
}
