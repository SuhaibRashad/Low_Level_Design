package BehaviouralPatterns.StratergyPattern.FlexiTextFormatterApplication;

import java.util.Scanner;

public class Client {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        Document document = new Document();

        String userInput = sc.nextLine();
        document.setContent(userInput);

        // Using PlainTextFormatter
        // TODO: Set the formatter for the document to PlainTextFormatter.
        document.setFormatter(new PlainTextFormatter());

        System.out.println("Plain Text:");
        document.display();

        // Using HTMLFormatter
        // TODO: Set the formatter for the document to HTMLFormatter.

        document.setFormatter(new HTMLFormatter());
        System.out.println("HTML Format:");
        document.display();

        // Using MarkdownFormatter
        // TODO: Set the formatter for the document to MarkdownFormatter.

        document.setFormatter(new MarkdownFormatter());
        System.out.println("Markdown Format:");
        document.display();

        sc.close();
    }

    public static void main(String[] args) {
       run();
    }

}
