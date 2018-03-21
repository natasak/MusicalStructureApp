package com.example.natasa.musicalstructureapp;

/** Gif image from: https://giphy.com/gifs/tony-sirico-206LP4kRMWd0Y  */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    private Button childrenButton, programmingButton, homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.now_playing);

        childrenButton = (Button) findViewById(R.id.children_button);
        programmingButton = (Button) findViewById(R.id.programming_button);
        homeButton = (Button) findViewById(R.id.home_button);

        //Set a clicklistener on that Button for children playlist
        childrenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the ChildrenActivity
                Intent childrenButtonIntent = new Intent(NowPlayingActivity.this, ChildrenActivity.class);

                //Start the new activity
                startActivity(childrenButtonIntent);
            }
        });

        //Set a clicklistener on that Button for programming playlist
        programmingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the ChildrenActivity
                Intent programmingButtonIntent = new Intent(NowPlayingActivity.this, ProgrammingActivity.class);

                //Start the new activity
                startActivity(programmingButtonIntent);
            }
        });

        //Set a clicklistener on that Button for home
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the ChildrenActivity
                Intent homeButtonIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                //Start the new activity
                startActivity(homeButtonIntent);
            }
        });

        // Get the data from previous activity (selected song in the playlist) and display it
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView myTextView = (TextView)findViewById(R.id.key_artist_text_view);
            TextView myTextView1 = (TextView)findViewById(R.id.key_title_text_view);
            TextView myTextView2 = (TextView)findViewById(R.id.key_duration_text_view);
            myTextView.setText(extras.getString("SONGARTIST"));
            myTextView1.setText(extras.getString("SONGTITLE"));
            myTextView2.setText(extras.getString("SONGDURATION"));
        }
    }
}
