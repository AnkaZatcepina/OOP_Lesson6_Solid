package solid7;
import solid7.dip.DisplayReport;
import solid7.dip.PrintInterface;
import solid7.dip.PrintReport;
import solid7.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        PrintInterface printReport = new PrintReport();
        report.calculate();
        report.output(printReport);
        report.output(new DisplayReport());
    }
}
