package com.example.natasa.musicalstructureapp;

/** Gif image from: https://giphy.com/gifs/tony-sirico-206LP4kRMWd0Y  */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.now_playing);

        //get the data from previous activity and display it
        //Intent secondIntent = getIntent( );
        //String message = "Selected song is " + secondIntent.getStringExtra("song_selected");

        //TextView myText = (TextView) findViewById(R.id.key_text_view);

        //myText.setText(message);
    }
}
