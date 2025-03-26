package CreationalPatterns.SingletonPattern.LoggerApplication;

import java.util.Scanner;

public class Client {
    public static void run() {

        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);

        // Get an info message from the user
        System.out.print("Enter an info message: ");
        String infoMessage = sc.nextLine();

        // TODO: Log the info message using the appropriate logging method.


        // Get a warning message from the user
        System.out.print("Enter a warning message: ");
        String warnMessage = sc.nextLine();

        // TODO: Log the warn message using the appropriate logging method.


        // Get an error message from the user
        System.out.print("Enter an error message: ");
        String errorMessage = sc.nextLine();

        // TODO: Log the warn message using the appropriate logging method.



        sc.close();
    }

    public static void main(String[] args) {
        run();
    }
}
