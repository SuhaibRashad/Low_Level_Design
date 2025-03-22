package CreationalPatterns.FactoryDesignPattern.DocumentCreationApplication;

public class WordDocument extends Document {
    @Override
    public void displayType() {
        System.out.println("Creating a Word Document");
    }
}
