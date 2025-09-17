package defaultmethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataExportDemo {
    public static void main(String[] args) {
        Map<String, Object> report = new LinkedHashMap<>();
        report.put("name","Abhishek"); report.put("score", 95); report.put("passed", true);
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();
        csv.exportToCSV(report); csv.exportToPDF(report); csv.exportToJSON(report);
        pdf.exportToCSV(report); pdf.exportToPDF(report); pdf.exportToJSON(report);
    }
}
