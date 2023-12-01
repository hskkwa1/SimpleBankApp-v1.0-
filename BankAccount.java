import java.lang.reflect.Array;
import java.util.List;

public class BankAccount {
    private int ID;
    private List<Transactions> transactions;
    private double Balance;
    private boolean isAvailable;
    private int customerId;

    public List<Transactions> getAllTransactions() {
        return transactions;
    }


}
