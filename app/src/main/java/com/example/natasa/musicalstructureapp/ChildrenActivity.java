package com.example.natasa.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChildrenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Twinkle, Twinkle Little Star"));
        songs.add(new Song("Head & Shoulders, Knees & Toes"));
        songs.add(new Song("Three Little Kittens"));
        songs.add(new Song("Old Mac Donald Had A Farm"));
        songs.add(new Song("Polly Put The Kettle On"));
        songs.add(new Song("Frere Jacques"));
        songs.add(new Song("Ring Around the Rosie"));
        songs.add(new Song("Six Little Ducks"));
        songs.add(new Song("Itsy Bitsy Spider"));
        songs.add(new Song("My Bonnie Lies Over The Ocean"));
        songs.add(new Song("Mary Had A Little Lamb"));
        songs.add(new Song("Row, Row, Row Your Boat"));

        /** Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         adapter knows how to create layouts for each item in the list, using the
         list_item.xml layout resource defined.
         This list item layout contains a single {@link TextView}, which the adapter will set to
         display a single song. */

        SongAdapter adapter = new SongAdapter(this, songs);

        /** Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         There should be a {@link ListView} with the view ID called list, which is declared in the
         song_list layout file.*/
        final ListView listView = (ListView) findViewById(R.id.list);

        /** Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
         {@link ListView} will display list items for each song in the list of songs.
         Do this by calling the setAdapter method on the {@link ListView} object and pass in
         1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter. */
        listView.setAdapter(adapter);

        //Set a clicklistener on each item in that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Get the data from the clicked item and send it to the new activity
                Song song = (Song) listView.getItemAtPosition(i);

                //Create a new intent to open the NowPlayingActivity
                Intent nowPlayingIntent = new Intent(ChildrenActivity.this, NowPlayingActivity.class);

                nowPlayingIntent.putExtra("SONGTITLE", song.getTitle());

                //int itemPosition     = i;

                //Start the new activity
                startActivity(nowPlayingIntent);

                //Toast.makeText(getApplicationContext(),"Position :"+itemPosition+"  ListItem : " +itemValue, Toast.LENGTH_LONG).show();
            }
        });
    }
}
