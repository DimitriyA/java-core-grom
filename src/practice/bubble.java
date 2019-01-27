package practice;

public class bubble {
    public static void main(String[] args) {
        int[] m = {1, 124, 43, -43, 53, 124, -12};

        for (int i = 0; i < m.length; i++) {
            int num = m[i];

            for (int j = i - 1; j >= 0; j--) {
                int leftNumer = m[j];

                if (num < leftNumer) {
                    m[i] = leftNumer;
                    m[j] = num;
                } else {
                }
                break;
            }
        }
    }
}