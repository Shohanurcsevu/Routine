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

public class MondayFragment extends Fragment {

    View view;
    TextView tvcse422;
    Dialog dcse422;
    Dialog dcse423;
    TextView tvcse423;


    public MondayFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.monday_fragment,container,false);
        tvcse422=(TextView)view.findViewById(R.id.mocse422);
        tvcse423=(TextView)view.findViewById(R.id.mocse423);
        dcse422=new Dialog(getActivity());
        dcse423=new Dialog(getActivity());


        tvcse422.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dcse422.setContentView(R.layout.popupcse422);
                dcse422.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dcse422.show();
            }
        });



        tvcse423.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dcse423.setContentView(R.layout.popupcse423);
                dcse423.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dcse423.show();
            }
        });
        return view;
    }
}
