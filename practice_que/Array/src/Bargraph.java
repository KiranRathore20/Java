public class Bargraph {
    //function for max and mid value
    static int maxElement(int []a) {

        int max = a[0];
        // int min = a[0];
        int n = a.length;

        for (int i = 0; i < n; i++) {
          /*  if (min > a[i]) {
                min = a[i];

            }*/
            if (max < a[i]) {
                max = a[i];

            }
        }
        return max;

    }

    //function for bargraph pattern
    static  void bargraph(int[]a){

        int n= a.length;
        int max =maxElement(a);
        //  for (int i=max;i>0;i--)
        //condition will be if (a[j]>=i)
        for(int i=1;i<=max;i++){
            for(int j=0;j<n;j++){
                if (a[j]>=max-i+1) System.out.print("*" +" ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int a[] = {4, 2, 0, 5,3, 1}; //a is array
        bargraph(a);
    }
}
