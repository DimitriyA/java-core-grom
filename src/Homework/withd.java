package Homework;

public class withd {
    public static void main(String[] args) {
        String [] names = {"Jack","Ann", "Denis","Andrey", "Nikolay", "Irirna"};
        int [] balances = {100,500,8432,99,12000,-54};
        System.out.println(widthraw(names,balances,"Nikolay",13000 ));

    }

    public static int widthraw(String[] clients, int[] balances, String client, int amount) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == client) {


                if (balances[i] >= amount) {
                    balances[i] = balances[i] - amount;
                    return balances[i];
                } else return -1;
            }



        } return -1;


    }
}
