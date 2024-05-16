public class App {
    public static void main(String[] args) throws Exception {

        //creating context
        VendingMachieContext vendingMachieContext = new VendingMachieContext();

        //set initial state
        vendingMachieContext.setState(new ReadyState());
        vendingMachieContext.handleRequest();

        vendingMachieContext.setState(new ProductSelectedState());
        vendingMachieContext.handleRequest();

        vendingMachieContext.setState(new PaymentPendingState());
        vendingMachieContext.handleRequest();

        vendingMachieContext.setState(new OutOfStockState());
        vendingMachieContext.handleRequest();

    }
}
