package com.glimmer8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor	//这里的注解代表类的构造器（全参）以及所有数据的get和set函数,建议自己写代码实现构造器和get
public class Song{
    private String title;
    private String artist;
    private int bpm;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public Song() {
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", bpm=" + bpm +
                '}';
    }
}