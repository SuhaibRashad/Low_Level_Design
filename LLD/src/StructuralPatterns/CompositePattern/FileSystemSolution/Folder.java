package StructuralPatterns.CompositePattern.FileSystemSolution;

import StructuralPatterns.CompositePattern.FileSystemProblem.File;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    String directoryName;
    List<FileSystemComponent> objectList;

    public Folder(String name) {
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(FileSystemComponent object) {
        objectList.add(object);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (FileSystemComponent obj : objectList) {
            obj.ls();
        }

    }
}
