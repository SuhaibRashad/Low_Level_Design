package StructuralPatterns.FlyWeightPattern.DocumentEditor;

import java.util.Scanner;

public class Client {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        Document doc = new Document();

        int numberOfCharacters = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfCharacters; i++) {
            String character = sc.nextLine();
            String fontStyle = sc.nextLine();
            String color = sc.nextLine();
            int fontSize = sc.nextInt();
            sc.nextLine();

            // TODO: Add the character to the document with the specified attributes.
            doc.addCharacter(character,  fontStyle,  fontSize,  color);

        }

        // TODO: Render the document to display its content.
        doc.render();


        sc.close();
    }

    public static void main(String[] args) {
        run();
    }
}
