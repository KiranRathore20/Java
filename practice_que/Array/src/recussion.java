public class recussion {

    public static void main(String args[]) {
        System.out.println("Decreasing");
        decreasing(6);
        System.out.println("Increasing");
        increasing(7);
        System.out.println("Increasing Decreasing");
        intDec(4);
        System.out.println("Factorial");
        int ans = fact(6);
        System.out.println(ans);
        System.out.println("Power");
        int r = power(2,6);
        System.out.println(r);
        System.out.println("fibonaccie series");
        int fibo = fib(6);
        System.out.println(fibo);


    }

    public static void increasing(int n) {
        if (n == 0) return;
        increasing(n - 1);
        System.out.println(n);
    }

    public static void decreasing(int n) {
        if (n == 0) return;
        System.out.println(n);
        decreasing(n - 1);

    }

    public static void intDec(int n) {
        if (n == 0) return;
        System.out.println(n);
        intDec(n - 1);
        System.out.println(n);
    }

    public static int fact(int n) {
       if(n == 1) return 1;
        int ans = n * fact(n - 1);
        //return n*fact(n-1);
        return ans;

    }
    public static int power(int a,int b){
        if(b==0) return 1;
        int r = a*power(a,b-1);
        return r;
    }
    public static int fib(int n) {
        if (n <= 1) return n;

        int fibo =fib(n-1)+fib(n-2);
        return fibo;
    }
}
