public class Star{
    //function for pattern1
    static void barchart1(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int numcount = 1;//counter for number
            char charcount ='A';//counter for character
            for (int j = 0; j < a[i]; j++) {
                if (i % 2 == 0) {
                    System.out.print(numcount +" ");
                    numcount++;
                } else {
                    System.out.print(charcount +" ");
                    charcount++;
                }
            }
                System.out.println();


        }
    }

        public static void main (String args[]){
            int a[] = {4,6,8,2,0,3,1};
            barchart1(a);


        }
    }
