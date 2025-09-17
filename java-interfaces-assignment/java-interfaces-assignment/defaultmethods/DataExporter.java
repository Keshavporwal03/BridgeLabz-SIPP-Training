package defaultmethods;

import java.util.Map;

public interface DataExporter {
    void exportToCSV(Map<String, Object> data);
    void exportToPDF(Map<String, Object> data);
    default void exportToJSON(Map<String, Object> data) {
        System.out.println("JSON: " + data.toString().replace('=', ':'));
    }
}
