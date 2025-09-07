import java.util.Scanner;

public class Index {
//int function
    public static int Index(int a[], int t) {
        int l = a.length;
        for (int i = 0; i < l; i++) {
            if (a[i] == t) {
                return i;
            }
        }
        return -1;
    }
public static void main(String args[]) {
    int[] a = {5, 4, 6, 1, 3};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a target value");
    int t = sc.nextInt();
    System.out.println(Index (a,t));
    }
}

