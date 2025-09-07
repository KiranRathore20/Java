import java.util.Scanner;

public class Max {
        //take user input and find maximum minimum spam length
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a arraylenght");
            int arraylg = sc.nextInt();
            int age[] = new int[arraylg];
            System.out.println("the " + arraylg + " is array");
            for (int i = 0; i < arraylg; i++) {
                age[i] = sc.nextInt();
            }
            int max =age[0];
            int min =age[0];
            System.out.println("the values of enterd  array is :");

            for (int i = 0; i < arraylg; i++) {
                System.out.println(age[i]);
                if (min > age[i]) {
                    min = age[i];

                }
                if (max< age[i]) {
                    max = age[i];

                }
            }

            int spam= max-min;
            System.out.println(" this is the maximum age :"+ max);
            System.out.println(" this is the minimum age :"+ min);
            System.out.println(" this is the spam :"+spam);

        }


    }

