
import java.util.Scanner;


public class mark {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input;
        do { 
            int mark =sc.nextInt();
            if(mark >=90 && mark<=100 ){
                System.out.println(" best");
            }else if(mark >=60 && mark<=89 ){
                System.out.println(" better ");
            }else if (mark >=50 && mark <=30) {
        System.out.println("good");
                } else{
                System.out.println("Invalid");
            }
            System.out.println(" want to continue( yes (1) or no(0)");
              input = sc.nextInt();
        } while (input==0);
    }


}
