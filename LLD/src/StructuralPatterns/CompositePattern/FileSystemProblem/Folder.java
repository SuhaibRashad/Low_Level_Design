package StructuralPatterns.CompositePattern.FileSystemProblem;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    String directoryName;
    List<Object> objectList;

    public Folder(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (Object obj : objectList) {

            if (obj instanceof File) {
                ((File) obj).ls();
            } else if (obj instanceof Folder) {
                ((Folder) obj).ls();
            }
        }
    }

    }
