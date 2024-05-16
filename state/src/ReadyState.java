public class ReadyState implements VendingMachineState{

    @Override
    public void handleRequest() {
        System.out.println("Ready State: Please select a product");
    }
    
}
