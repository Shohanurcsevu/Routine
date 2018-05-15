package com.example.mdshohanurrahman.batchcommunity;

import android.app.UiAutomation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView routine,message,developper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //Define class
        developper=(CardView)findViewById(R.id.developper);
        routine=(CardView)findViewById(R.id.routine);
        message=(CardView)findViewById(R.id.comu);
        //Set ObClickListener

        routine.setOnClickListener(this);
        message.setOnClickListener(this);
        developper.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId())
        {
            case R.id.routine : i =new Intent(this,Routine.class);startActivity(i);break;
            case R.id.comu: i=new Intent(this,Message.class);startActivity(i);break;
            case R.id.developper: i=new Intent(this,Developper.class);startActivity(i);break;
            default: break;


         }


    }
}
