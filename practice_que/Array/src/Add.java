public class Add {
    public static void main(String args[]) {
        int[] a = {1, 3, 4, 5};
        int[] b = {6, 4, 5};

        int min = Math.min(a.length, b.length); // we can use Math.min method as well to find minimum length
//        if (a.length< b.length){
//            min =a.length;
//        }else{
//            min=b.length;
//        }
        int[] c = new int[min];
        for (int i = 0; i < min; i++) {
            c[i] = a[i] + b[i];
          //  c[i] = a[i] * b[i];
            // c[i] = a[i] - b[i];

        }
        // to print in array we can use Arrays.toString4
        for (int value : c) {
            System.out.print(value + " ");
        }


        }
    }
