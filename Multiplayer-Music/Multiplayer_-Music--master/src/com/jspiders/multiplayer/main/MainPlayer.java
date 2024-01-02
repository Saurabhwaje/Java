package com.jspiders.multiplayer.main;

import java.util.Scanner;
import com.jspiders.multiplayer.songs.Songs;
import com.jspiders.multiplayer.operations.SongOperations;

public class MainPlayer {
    private static boolean isRunning = true;
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);
    private static SongOperations songOperations = new SongOperations();

    public static void main(String[] args) {
        startMusicPlayer();
    }

    private static void startMusicPlayer() {
        while (isRunning) {
            System.out.println("-----------START-----------");
            System.out.println("1. Add / Remove song\n" + "2. Play Song\n" + "3. Edit Song\n" + "4. Exit\n");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleAddRemoveMenu();
                    break;
                case 2:
                    handlePlayMenu();
                    break;
                case 3:
                    // Edit Song
                    songOperations.editSong();
                    break;
                case 4:
                    // Exit
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleAddRemoveMenu() {
        System.out.println("1. Add a song\n" + "2. Remove a song\n" + "3. Shuffle Song\n" + "4. Back");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                songOperations.addSong();
                break;
            case 2:
                songOperations.displaySongs();
                songOperations.removeSong();
                break;
            case 3:
                songOperations.shuffleSong();
                break;
            case 4:
                // Back
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void handlePlayMenu() {
        System.out.println("1. Play all songs\n" + "2. Choose Song\n" + "3. Shuffle\n" + "4. Exit\n");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                songOperations.playSong();
                break;
            case 2:
                songOperations.displaySongs();
                break;
            case 3:
                songOperations.shuffleSong();
                break;
            case 4:
                // Exit
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
