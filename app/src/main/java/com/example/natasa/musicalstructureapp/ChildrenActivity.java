package com.example.natasa.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by natasa on 16/03/18.
 */

public class ChildrenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Romana kranjcan", "Racke na potepu", "2:34"));
        songs.add(new Song("Romana kranjcan", "Racke na potepu", "2:34"));
        songs.add(new Song("Romana kranjcan", "Racke na potepu", "2:34"));

        /** Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         adapter knows how to create layouts for each item in the list, using the
         list_item.xml layout resource defined.
         This list item layout contains a single {@link TextView}, which the adapter will set to
         display a single song. */

        SongAdapter adapter = new SongAdapter(this, songs);

        /** Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         There should be a {@link ListView} with the view ID called list, which is declared in the
         song_list layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /** Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
         {@link ListView} will display list items for each song in the list of songs.
         Do this by calling the setAdapter method on the {@link ListView} object and pass in
         1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter. */
        listView.setAdapter(adapter);

    }
}
