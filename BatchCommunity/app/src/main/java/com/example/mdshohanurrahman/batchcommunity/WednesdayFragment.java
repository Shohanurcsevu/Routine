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

import org.w3c.dom.Text;

public class WednesdayFragment extends Fragment{


     View view;

     TextView csee421;
     TextView cse425;
     TextView cse424;
     Dialog dialogcse421;
     Dialog dialogcse424;
     Dialog dialogcse425;

    public WednesdayFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.wednesday_fragment,container,false);

        csee421=(TextView)view.findViewById(R.id.wedcse421);
        cse424=(TextView)view.findViewById(R.id.wedcse424);
        cse425=(TextView)view.findViewById(R.id.wedcse425);

        dialogcse421=new Dialog(getActivity());
        dialogcse424=new Dialog(getActivity());
        dialogcse425=new Dialog(getActivity());

        csee421.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogcse421.setContentView(R.layout.popupcse421);
                dialogcse421.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialogcse421.show();
            }
        });

        cse424.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogcse424.setContentView(R.layout.popupcse424);
                dialogcse424.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialogcse424.show();
            }
        });

           cse425.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   dialogcse425.setContentView(R.layout.popupcse425);
                   dialogcse425.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                   dialogcse425.show();
               }
           });
        return view;
    }
}
