package factories;


import products.Gpu;
import products.Monitor;
import products.MsiGpu;
import products.MsiMonitor;

// Now, how about the product variants? For each variant of a product family, we create a separate factory
// class based on the AbstractFactory interface. A factory is a class that returns products of a particular kind. 
// For example the MsiManufacturer can only create MsiGpu and MsiMonitor.

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
