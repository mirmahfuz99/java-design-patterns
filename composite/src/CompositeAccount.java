import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account{

    public List<Account> accountList = new ArrayList<Account>();

    private float totalBalance;
    

    @Override
    public float getBalance() {
        
        totalBalance = 0;
        for (Account account : accountList){
            totalBalance = totalBalance + account.getBalance();
        }

        return totalBalance;
    }

    public void addAccount(Account acc){
        accountList.add(acc);
    }
    

    public void removeAccount(Account acc){
        accountList.remove(acc);
    }
}
