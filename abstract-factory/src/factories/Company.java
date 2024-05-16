package factories;

import products.Gpu;
import products.Monitor;

public abstract class Company {


    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();

    
    
}
