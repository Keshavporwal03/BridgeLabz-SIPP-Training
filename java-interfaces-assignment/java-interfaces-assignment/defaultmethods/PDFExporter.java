package defaultmethods;

import java.util.Map;

public class PDFExporter implements DataExporter {
    @Override public void exportToCSV(Map<String, Object> data) {
        System.out.println("CSV export (stub): " + data);
    }
    @Override public void exportToPDF(Map<String, Object> data) {
        System.out.println("PDF export (stub): " + data);
    }
}
