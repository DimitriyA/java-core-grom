package lesson8.accounts;

public class Account {

    String bankName;
    String ownerName;
    int moneyamount;

    public Account(String bankName, String ownerName, int moneyamount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyamount = moneyamount;
    }

    void depositMoney(int amount) {
        moneyamount += amount;
    }

    //overLoading
    void depositMoney() {
        moneyamount += 1000;
        System.out.println("deposit was successful");
    }

    void changeOwnerName(String newOwnerName) {
        ownerName = newOwnerName;
    }
}
    