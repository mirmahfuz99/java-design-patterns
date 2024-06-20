public abstract class Restaurant {

    public void orderBuger(){
        Burger burger = createBurger();
        burger.prepare();
    }

    //factory method
    public abstract Burger createBurger();
    
}
