package lesson4;

import static java.lang.Integer.MAX_VALUE;

public class compSums {
    public static void main(String[] args) {
       compareSums(-1, -3, -1, -5);

    }


    public static void   compareSums(int a, int b, int c, int d) {
            System.out.println(sum(a,b) > sum(c,d));


    }

    public static long sum(long from, long to) {
        long summ = 0, a = 1, b = MAX_VALUE;

        for (long i = from; i <= to; i++) {
            summ += i;

        }
        return summ;
    }
}
