package BehaviouralPatterns.TemplatePattern.ReportGenerator;

import java.util.Scanner;

public class SalesReport extends ReportTemplate {

    private Scanner sc;
    public String gd;

    public SalesReport(Scanner sc) {
        this.sc = sc;
    }

    @Override
    protected void gatherData() {
        String gatherData = sc.nextLine();
        this.gd = gatherData;
        System.out.println(gatherData);
    }

    @Override
    protected void processData() {
        String processData = sc.nextLine();
        System.out.println(processData);
    }

    protected void formatReport() {
        System.out.println("Formatting the report with appropriate layout and style of sales.");
    }

}