package factories;


import products.Gpu;
import products.Monitor;
import products.MsiGpu;
import products.MsiMonitor;

public class MsiManufacturer extends Company{

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
    
}
