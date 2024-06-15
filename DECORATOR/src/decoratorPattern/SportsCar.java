package decoratorPattern;

public class SportsCar extends CarDecorator{

    SportsCar(Car car) {
        super(car);
        
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println(" Adding featires of Sports car !");
    }



    
}
