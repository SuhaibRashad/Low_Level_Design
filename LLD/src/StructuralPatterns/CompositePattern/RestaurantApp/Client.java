package StructuralPatterns.CompositePattern.RestaurantApp;

import java.awt.*;
import java.util.Scanner;

public class Client {
    public static void run() {

        Scanner sc = new Scanner(System.in);

        String appetizersSectionName = sc.nextLine();
        String mainCoursesSectionName = sc.nextLine();
        String dessertsSectionName = sc.nextLine();
        String seaFoodSectionName = sc.nextLine();

        MenuSection appetizers = new MenuSection(appetizersSectionName);
        MenuSection mainCourses = new MenuSection(mainCoursesSectionName);
        MenuSection desserts = new MenuSection(dessertsSectionName);
        MenuSection seafood = new MenuSection(seaFoodSectionName);

        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            // TODO: Create a new MenuItem for the appetizer using the provided name, description, and price
            MenuComponent item = new MenuItem( name,  description,  price);

            // TODO: Add the newly created appetizer to the appetizers menu section

            appetizers.add(item);
        }

        // Get user input for main courses
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            // TODO: Create a new MenuItem for the main course using the provided name, description, and price
            MenuComponent item = new MenuItem( name,  description,  price);

            // TODO: Add the newly created appetizer to the appetizers menu section

            mainCourses.add(item);

            // TODO: Add the newly created main course to the mainCourses menu section


        }

        // Get user input for desserts
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            // TODO: Create a new MenuItem for the dessert using the provided name, description, and price
            MenuComponent item = new MenuItem( name,  description,  price);

            // TODO: Add the newly created appetizer to the appetizers menu section

            desserts.add(item);

            // TODO: Add the newly created dessert to the desserts menu section


        }

        mainCourses.add(seafood);

        MenuSection fullMenu = new MenuSection("Restaurant Menu");

        // TODO: Add the appetizers section to the full menu
        fullMenu.add(appetizers);
        fullMenu.add(mainCourses);
        fullMenu.add(desserts);

        // TODO: Add the main courses section to the full menu


        // TODO: Add the desserts section to the full menu

        System.out.println("\nFull Menu:");

        // TODO: Print the full menu contents

        fullMenu.print();

        sc.close();
    }
    public static void main(String[] args) {
run();
    }
}
