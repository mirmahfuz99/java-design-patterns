public class SavingAccount extends Account {

    private String accoutNumber;
    private float accountBalance;

    public SavingAccount(float accountBalance, String accountNumber){
        super();
        this.accountBalance = accountBalance;
        this.accoutNumber = accoutNumber;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }
    
}
