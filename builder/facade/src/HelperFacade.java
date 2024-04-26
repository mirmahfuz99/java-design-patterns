import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName){

        Connection con = null;
        switch(dbTypes){
            case MYSQL:
                    con = MySqlHelper.getMySqlDBConnection();
                    MySqlHelper mySqlHelper = new MySqlHelper();
                    switch(reportTypes){
                        case HTMLReport:
                                mySqlHelper.generateMySqlHTMLReport(tableName, con);
                                break;
                        case PDFReport:
                                mySqlHelper.generateMySqlPDFReport(tableName, con);        
                    }
                    break;

            case ORACLE:
                con = MySqlHelper.getMySqlDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch(reportTypes){
                    case HTMLReport:
                            oracleHelper.generateOracleHTMLReport(tableName, con);
                            break;
                    case PDFReport:
                    oracleHelper.generateOraclePDFReport(tableName, con);     
                }
                break;
        }
    }

    public static enum DBTypes{
        MYSQL, ORACLE;
    }

    public static enum ReportTypes{
        PDFReport, HTMLReport;
    }
}
