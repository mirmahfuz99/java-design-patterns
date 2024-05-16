public class VendingMachieContext {

    private VendingMachineState state;

    public void setState(VendingMachineState vendingMachineState){
        this.state = vendingMachineState;
    }

    public void handleRequest(){
        this.state.handleRequest();
    }
    
}
