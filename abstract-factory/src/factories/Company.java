package factories;

import products.Gpu;
import products.Monitor;

//Abstract factory interface. Abstract Factory—an interface with a list of creation methods for all products.
//These methods must return abstract product types represented by the interfaces we extracted previously Gpu and Monitor.
public abstract class Company {


    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();

    
    
}
