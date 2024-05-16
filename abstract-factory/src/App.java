import factories.Company;
import factories.MsiManufacturer;

public class App {
    public static void main(String[] args) throws Exception {
        Company msi = new MsiManufacturer();
        msi.createGpu().assemble();
    }
}
