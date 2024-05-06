public class Client {
    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();

        component.addAccount(new DepositeAccount(10, "101"));
        component.addAccount(new DepositeAccount(20, "102"));
        component.addAccount(new DepositeAccount(30, "103"));


        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);

    }
}
