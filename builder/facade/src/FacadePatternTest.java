import HelperFacade.ReportTypes;

public class FacadePatternTest {
    public static void main(String[] args) {

        String tableName = "Employee";

        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTMLReport, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDFReport, tableName);

    }
}