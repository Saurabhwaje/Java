package com.jspiders.multiplayer.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.jspiders.multiplayer.songs.Songs;

public class SongOperations {
    private List<Songs> playlist = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addSong() {
        System.out.println("How many songs do you want to add?");
        int numberOfSongs = scanner.nextInt();

        for (int i = 1; i <= numberOfSongs; i++) {
            Songs song = new Songs();

            System.out.println("Enter the id of the song:");
            int id = scanner.nextInt();
            song.setId(id);

            System.out.println("Enter the name of the song:");
            String songName = scanner.next();
            song.setSongName(songName);

            System.out.println("Who is the singer?");
            String singer = scanner.next();
            song.setSinger(singer);

            System.out.println("What is the duration of the song?");
            double duration = scanner.nextDouble();
            song.setDuration(duration);

            System.out.println("Enter the album name:");
            String album = scanner.next();
            song.setMovieAlbum(album);

            System.out.println("Who wrote the song?");
            String lyricist = scanner.next();
            song.setLyricist(lyricist);

            playlist.add(song);
        }
        System.out.println("Songs added successfully");
    }

    public void displaySongs() {
        System.out.println();
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + 1 + ". " + playlist.get(i).getSongName() + " - " + playlist.get(i).getId());
            System.out.println();
        }
    }

    public void removeSong() {
        System.out.println("Which song do you want to delete?");
        try {
            int choice = scanner.nextInt();
            playlist.remove(choice - 1);
            System.out.println("Successfully deleted");
            System.out.println("Available songs:");
            displaySongs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playSong() {
        System.out.println(playlist.get(0).getSongName() + " is playing");
    }

    public void chooseSong() {
        displaySongs();
        System.out.println("Which song do you want to play?");
        int chosenSong = scanner.nextInt();
        System.out.println(playlist.get(chosenSong - 1).getSongName() + " is playing");
    }

    public void shuffleSong() {
        Collections.shuffle(playlist);
        System.out.println("Playlist shuffled: " + playlist);
    }

    public void editSong() {
        displaySongs();
        System.out.println("Which song do you want to edit?");
        int choice = scanner.nextInt();

        Songs songToEdit = playlist.get(choice - 1);

        System.out.println("Enter the new id of the song:");
        int id = scanner.nextInt();
        songToEdit.setId(id);

        System.out.println("Enter the new name of the song:");
        String songName = scanner.next();
        songToEdit.setSongName(songName);

        System.out.println("Who is the new singer?");
        String singer = scanner.next();
        songToEdit.setSinger(singer);

        System.out.println("What is the new duration of the song?");
        double duration = scanner.nextDouble();
        songToEdit.setDuration(duration);

        System.out.println("Enter the new album name:");
        String album = scanner.next();
        songToEdit.setMovieAlbum(album);

        System.out.println("Who wrote the new song?");
        String lyricist = scanner.next();
        songToEdit.setLyricist(lyricist);

        System.out.println("Song edited successfully");
    }
}
