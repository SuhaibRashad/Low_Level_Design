package BehaviouralPatterns.StratergyPattern.FlexiTextFormatterApplication;

public class HTMLFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        // TODO: Wrap the input text in HTML tags: "<html><body>" and "</body></html>".4
        return "<html><body>"+text+"</body></html>";
    }
}