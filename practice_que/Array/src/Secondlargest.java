import java.sql.SQLOutput;
import java.util.Scanner;
public class Secondlargest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a arraylenght");
        int arraylg = sc.nextInt();
        int a[] = new int[arraylg];
        System.out.println("the " + arraylg + " is array");
        for (int i = 0; i < arraylg; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int secmax = Integer.MIN_VALUE;
        for (int i = 0; i < arraylg; i++) {
            System.out.println(a[i]);
            if (max < a[i]) {
                secmax = max;
                max = a[i];

            } else if (a[i] > secmax && a[i] < max) {
                secmax = a[i];

            }
            System.out.print(secmax);

        }

        // Print the largest and second-largest elements
        System.out.println("The largest element is: " + max);
        if (secmax != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secmax);
        } else {
            System.out.println("No second largest element exists.");
        }
    }
}