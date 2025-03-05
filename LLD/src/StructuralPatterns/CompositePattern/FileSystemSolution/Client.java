package StructuralPatterns.CompositePattern.FileSystemSolution;

public class Client {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        Folder folder = new Folder("Documents");
        folder.add(file1);
        folder.add(file2);

        //Subfolder
        Folder subfolder = new Folder("Subfolder");
        FileSystemComponent file3 = new File("File3.txt");

        subfolder.add(file3);
        folder.add(subfolder);

        folder.ls();

    }
}
