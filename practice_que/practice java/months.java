
import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int months = sc.nextInt();
    switch (months) {
        case 1:System.out.println("Jan");
             break;
             case 2: System.out.println("feb");
    break;
    case 3: System.out.println("march");
    break;
    case 12: System.out.println("dec");
    break;
        default:System.out.println("Invalid month");
            break;
    }
    }
}
