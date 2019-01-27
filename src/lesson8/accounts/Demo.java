package lesson8.accounts;

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccounts = new SavingAccount("Somebank", "Denis", 1000, 50);
        savingAccounts.depositMoney(100);

        System.out.println(savingAccounts.moneyamount);
        savingAccounts.changeOwnerName("Oleg");

        System.out.println(savingAccounts.ownerName);


        CheckingAccount checkingAccounts = new CheckingAccount("Somebank", "Denis", 1000, 500);
        checkingAccounts.changeOwnerName("Oleg");

        System.out.println(checkingAccounts.ownerName);


    }
}
