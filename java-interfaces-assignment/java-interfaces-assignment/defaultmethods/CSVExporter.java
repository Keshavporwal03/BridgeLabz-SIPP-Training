package defaultmethods;

import java.util.Map;

public class CSVExporter implements DataExporter {
    @Override public void exportToCSV(Map<String, Object> data) {
        StringBuilder sb = new StringBuilder();
        data.forEach((k,v) -> sb.append(k).append(',').append(v).append('\n'));
        System.out.print(sb.toString());
    }
    @Override public void exportToPDF(Map<String, Object> data) {
        System.out.println("PDF export (stub): " + data);
    }
}
