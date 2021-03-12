package arrays;

public class LeftRotation {

    public static void main(String[] args) {

        for (int el: rotLeft(new int[]{1,2,3,4,5}, 4)) {
            System.out.println(el);
        }

    }

    static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++) {

            int firstElement = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = firstElement;

        }

        return a;
    }

}
