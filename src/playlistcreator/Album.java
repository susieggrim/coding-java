package playlistcreator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);
        if (song != null) {
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song: songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (songs.size() > 0 && trackNumber <= songs.size()) {
            playlist.add(songs.get(trackNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}
