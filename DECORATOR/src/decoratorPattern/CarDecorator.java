package decoratorPattern;
// Decorator class implements the component interface and it has a HAS-A relationship with the component interface.
// The component variable should be accessible to the child decorator classes, so we will make this variable protected.


public class CarDecorator implements Car{

    protected Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}