package solid7.dip;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(PrintInterface reportPrint){
        //PrintReport reportPrint = new PrintReport();
        reportPrint.output(items);
    }
}