package com.example.natasa.musicalstructureapp;

/** Gif image from: https://giphy.com/gifs/tony-sirico-206LP4kRMWd0Y  */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.now_playing);
    }
}
