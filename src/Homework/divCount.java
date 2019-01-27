package Homework;

public class divCount {
    public static void main(String[] args) {
        System.out.println(findDivCount(1,10, 2));

    }

    public static int findDivCount(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                count++;
        }


        return count;

    }

}
