package CreationalPatterns.FactoryDesignPattern.DocumentCreationApplication;

public class PDFDocument extends Document {
    @Override
    public void displayType() {
        System.out.println("Creating a PDF Document");
    }
}
