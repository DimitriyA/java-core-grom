package practice;

public class Homework {
    public static void main(String[] args) {
        System.out.println(finddiv(1,10,2));

    }

    public static int finddiv(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++){
            if (i % n == 0)
                count++;
        }
        return count;
    }
}
