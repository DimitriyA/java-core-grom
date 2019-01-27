package practice;

public class ar {
    public static void main(String[] args) {
       int [] array = {-1,10,110,0,-25,0,60};
        System.out.println(maxElement(array));
        System.out.println(cCount(array,10));
    }



    public static int maxElement (int [] array){
       int max = array[0];

       for(int el : array){
           if(el > max)
               max = el;
       }
       return max;
    }
    public static int cCount (int [] array, int n){
        int count = 0;
        for (int el : array){
            if(el == n)
                count++;
        }
        return count;
    }
}
