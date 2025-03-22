package CreationalPatterns.FactoryDesignPattern.DocumentCreationApplication;

public class HTMLDocument extends Document{
    @Override
    public void displayType() {
        System.out.println("Creating an HTML Document");
    }
}
