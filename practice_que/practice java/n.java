
import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (i = 0; i <= n; i++){
            sum = sum + i;

        }
        System.out.println( sum);
    }

}
