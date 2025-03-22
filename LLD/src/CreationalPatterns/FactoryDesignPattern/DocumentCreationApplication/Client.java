package CreationalPatterns.FactoryDesignPattern.DocumentCreationApplication;

import java.util.Scanner;

public class Client {
    public static void run() {

        Scanner sc = new Scanner(System.in);

        String documentType = sc.nextLine();

        try {
            // TODO: Create a document instance using the DocumentFactory based on user input
            Document df =  DocumentFactory.createDocument(documentType);

            // TODO: Display the type of the created document instance
            df.displayType();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
