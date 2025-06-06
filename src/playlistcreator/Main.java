package playlistcreator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        System.out.println("added to playlist? " + albums.get(0).addToPlayList(11, playlist));
        System.out.println("added to playlist? " + albums.get(0).addToPlayList(5, playlist));
        System.out.println("added to playlist? " + albums.get(0).addToPlayList("Soldier of fortune", playlist));
        System.out.println("added to playlist? " + albums.get(0).addToPlayList("Some random song", playlist));
    }

}
