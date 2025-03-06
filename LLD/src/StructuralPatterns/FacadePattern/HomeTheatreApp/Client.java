package StructuralPatterns.FacadePattern.HomeTheatreApp;

import java.util.Scanner;

public class Client {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        int dimmingPercentage = sc.nextInt();

        int volumeLevel = sc.nextInt();

        // TODO: Initiate the movie-watching experience by providing the dimming percentage and the volume level

        HomeTheaterFacade hm = new HomeTheaterFacade();
        hm.watchMovie(dimmingPercentage,volumeLevel);

        sc.close();
    }

    public static void main(String[] args) {
        run();
    }
}
