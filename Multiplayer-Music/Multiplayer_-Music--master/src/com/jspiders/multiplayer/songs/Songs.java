package com.jspiders.multiplayer.songs;

public class Songs {
    private int id;
    private String songName;
    private String singer;
    private double duration;
    private String movieAlbum;  // Updated variable name to follow Java naming conventions
    private String lyricist;    // Updated variable name to follow Java naming conventions

    // Constructors can be added if needed

    // Getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getMovieAlbum() {
        return movieAlbum;
    }

    public void setMovieAlbum(String movieAlbum) {
        this.movieAlbum = movieAlbum;
    }

    public String getLyricist() {
        return lyricist;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    // Override toString() for better representation when printing
    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", singer='" + singer + '\'' +
                ", duration=" + duration +
                ", movieAlbum='" + movieAlbum + '\'' +
                ", lyricist='" + lyricist + '\'' +
                '}';
    }
}
