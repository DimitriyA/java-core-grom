package Homework;

public class hmw5 {
    public static void main(String[] args) {
        int [] izgoid = {10,23,-10,24,-100,50};
        for (int i : sortAscending(izgoid))
        System.out.println(i);
        for (int i : sortDescending(izgoid))
            System.out.println(i);

    }
    public static int[] sortAscending ( int[] array){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int perem = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = perem;
                    isSorted = false;
                }
            }

        }
        return array;
    }

    public static int[] sortDescending ( int[] array){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int perem = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = perem;
                    isSorted = false;
                }
            }

        }
        return array;
    }


}
