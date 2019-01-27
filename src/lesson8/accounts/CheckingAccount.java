package lesson8.accounts;

public class CheckingAccount extends Account {
    int limitOfExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyamount, int limitOfExpenses) {
        super(bankName, ownerName, moneyamount);
        this.limitOfExpenses = limitOfExpenses;
    }

    void withdraw(int amount) {
        if (amount > limitOfExpenses)
            return;
        moneyamount -= amount;
    }


}

