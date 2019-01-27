package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {

        int i = 1;
        int sum =0 ;
        while(i <= 1000) {
            sum += i;
            i++;
        }

        int numb = 1234;
        int div = sum / numb;
        int wt = sum % numb;
        boolean result  = wt > div;
        System.out.println(result);



    }
}
