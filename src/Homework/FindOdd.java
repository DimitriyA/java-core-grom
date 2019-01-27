package Homework;

public class FindOdd {
    public static void main(String[] args) {
        int a = 0;
        int summ = 0;
        while (a <= 1000) {
            if (a % 2 == 1) {
                System.out.println("Found");
                summ += a;

            }

            a++;

        }
        if (summ * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }


    }
}
