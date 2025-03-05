package StructuralPatterns.CompositePattern.FileSystemSolution;

public class File implements FileSystemComponent{
    String name;
    File(String name) {
        this.name =name;
    }


    public void ls(){
        System.out.println("File " + name );
    }
}
