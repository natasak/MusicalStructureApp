package com.example.natasa.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Show the View that shows the selected category
        TextView children = (TextView)findViewById(R.id.children);
        TextView programming = (TextView)findViewById(R.id.programming);
        TextView travelling = (TextView)findViewById(R.id.travelling);

        //Set a clicklistener on that View for children category
        children.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the ChildrenActivity
                Intent childrenIntent = new Intent(MainActivity.this, ChildrenActivity.class);

                //Start the new activity
                startActivity(childrenIntent);
            }
        });

        //for programming category
        programming.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the ProgrammingActivity
                Intent programmingIntent = new Intent(MainActivity.this, ProgrammingActivity.class);

                //Start the new activity
                startActivity(programmingIntent);
            }
        });

        //for travelling
        travelling.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the TravellingActivity
                Intent travellingIntent = new Intent(MainActivity.this, TravellingActivity.class);

                //Start the new activity
                startActivity(travellingIntent);
            }
        });

    }
}
