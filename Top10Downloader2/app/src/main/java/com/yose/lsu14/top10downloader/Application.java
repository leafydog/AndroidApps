package com.yose.lsu14.top10downloader;

/**
 * Created by LSU14 on 07/07/2016.
 */
public class Application {
    private String name;
    private String artist;
    private String releaseDate;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nArtist: " + this.getArtist()
                + "\nRelease Date: " + this.getReleaseDate() + "\n";
    }
}
