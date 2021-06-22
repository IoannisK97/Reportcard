package com.example.jandroid.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView) findViewById(R.id.textViewReport);
        Button openButton =(Button) findViewById(R.id.openButton);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] tempArrayString= {"Maths","English","Physics","Astronomy","ICT","Latin","Religious Studies","Philosophy","French","Accounting"};
                int[] tempArrayInt={98,67,89,90,12,23,34,45,56,67,};
                Report report=new Report( tempArrayString , tempArrayInt,"Steve");
                textView.setText(report.toString());

            }
        });




    }


}