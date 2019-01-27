package lesson8.accounts;

public class SavingAccount extends Account {

    int savingPerMonths;
    int savings;

    public SavingAccount(String bankName, String ownerName, int moneyamount, int savingPerMonths) {
        super(bankName, ownerName, moneyamount);
        this.savingPerMonths = savingPerMonths;
    }

    @Override
    void changeOwnerName(String newOwnerName) {
        if (newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't  change owner name of this saving account");
    }

}
