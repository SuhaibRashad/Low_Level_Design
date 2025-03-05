package StructuralPatterns.CompositePattern.FileSystemProblem;

public class Client {
    public static void main(String[] args) {
        Folder movieDirectory = new Folder("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Folder comedyMovieDirectory = new Folder("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
