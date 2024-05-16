public abstract class Restaurant {

    public void orderBuger(){
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
    
}
