import java.util.Arrays;

public class Zero {
    static void moveZero(int[] a) {
        int n = a.length;
        int index= 0; // non-zero element position //id= index value

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                // swap non-zero element with index value
                int temp = a[i]; // putting value in temp
                a[i] = a[index];
                a[index] = temp;

                index++; // move the index value
            }
        }
        }
            public static void main(String...args){
                int [] a={2,0,6,0,-8,-9,0,9,0,-5};
                System.out.println(Arrays.toString(a));
                moveZero(a);
                System.out.println(Arrays.toString(a)); // to print resultant value
            }
}
