package com.example.natasa.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songs          A List of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        /** Here, we initialize the ArrayAdapter's internal storage for the context and the list.
         the second argument is used when the ArrayAdapter is populating a single TextView.
         Because this is a custom adapter for three TextViews, the adapter is not
         going to use this second argument, so it can be any value. Here, we used 0. */
        super(context, 0, songs);
    }

    /**
     * Provides a view for and AdapterView
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Song object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist text view from the current Song object and
        // set this text on the artist TextView
        artistTextView.setText(currentSong.getArtist());

        // Find the TextView in the list_item.xml layout with the ID song_title_text_view
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title_text_view);
        // Get the song title text view from the current Song object and
        // set this text on the song title TextView
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the list_item.xml layout with the ID duration_text_view
        TextView durationTextView = (TextView) listItemView.findViewById(R.id.duration_text_view);
        // Get the song duration text view from the current Song object and
        // set this text on the duration TextView
        durationTextView.setText(currentSong.getDuration());



        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;


    }
}
