package StructuralPatterns.ProxyPattern.NetworkService;

import java.util.Scanner;

public class Client {
     public static void run() {

        NetworkService networkService = new NetworkServiceProxy();
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        // TODO: Fetch data using the networkService and print the result
        System.out.println(networkService.fetchData(userInput));


        // TODO: Fetch data again using the networkService (should retrieve from cache) and print the result
        System.out.println(networkService.fetchData(userInput));

        sc.close();
    }

    public static void main(String[] args) {
        run();
    }
}
