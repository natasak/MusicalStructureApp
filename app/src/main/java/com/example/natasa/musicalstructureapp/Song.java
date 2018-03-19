package com.example.natasa.musicalstructureapp;



public class Song {

    /** Song artist */
    private String mArtist;

    /** Song Title */
    private String mTitle;

    /** Duration of a song in String */
    private String mDuration;

    /**
     * Create a new Song object = constructor
     *
     * @param artist is a song artist
     * @param title is the title of a song
     * @param duration is the duration of a song
     *
     */
    public Song(String artist, String title, String duration) {
        mArtist = artist;
        mTitle = title;
        mDuration = duration;
    }

    /** Get the artist of a song */
    public String getArtist() {
        return mArtist;
    }

    /** Get the title of a song */
    public String getTitle() {
        return mTitle;
    }

    /** Get the duration of a song */
    public String getDuration() {
        return mDuration;
    }

}
