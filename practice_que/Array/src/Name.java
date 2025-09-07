import java.util.Arrays;
import java.util.Scanner;

public class Name {
    static  void  rotate( int[]a,int k){
         int n = a.length;
         k=k%n;
        for (int i = 0; i < n; ++i)
            System.out.print(a[(i + k) % n] + " ");

        System.out.println();
    }

//                 for (int i = 0; i < k; i++){
//                     int temp=a[0];
//                     for (int j = 0; j < n-1; j++) {
//                         a[j] = a[j+1];
//                     }
//                         a[n-1]=temp;
//
//             }
     //   System.out.println("Rotate array"+Arrays.toString(a));



    //     }

    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
      int [] a = {1,2,3,4,5};
        System.out.println(" enter a value of k :");
      int k = sc.nextInt();
        System.out.println("Orignal array"+ Arrays.toString(a));
      rotate(a,k);
    }

}
