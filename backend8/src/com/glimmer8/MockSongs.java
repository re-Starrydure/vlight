package com.glimmer8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        //模拟将要处理的列表
        songs.add("sunrise");
        songs.add("noprice");
        songs.add("thanks");
        songs.add("$100");
        songs.add("havana");
        songs.add("114514");
        return songs;
    }

    public static List<Song> getSongObject(){
        List<Song> songs = new ArrayList<>();
        return songs;
    }
}

class a {
    public static void main(String[] args) {
        List<String> songs = MockSongs.getSongStrings();
        Collections.sort(songs);
        System.out.println(songs);
        List<Song> song = MockSongs.getSongObject();
        song.add(new Song("IOR","ariol",169));
        song.add(new Song("the world of scarlet","OfficalAz3",209));
        song.add(new Song("Fine logic","Sephid",170));
        song.add(new Song("slic.hertz","Sobrem",167));
        System.out.println(song);
    }
}