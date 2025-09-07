public class P {
    public static void main(String args []){
        int n=4;

       //int number=1;
        //int m=5;
        // reactangle
        //outer loop
    /*  for( int i=1; i<=4; i++) {
            //inner loop
            for(int j=2; j<=5; j++){
            System.out.print(" 5 ");
            }
            System.out.println(" 4 ");
        }*/
        //hallow rectangle
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (i==1 || j==0 || i==n || j==m ) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
        //half pyramid only one  value we will take // number
    /*  for(int i=1;i<=n; i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }*/
        //reverse half pyramid of number
         /*for(int i=1;i<=n; i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
            }*/
        // half pyramid rotate 180
    /*   for(int i=1;i<=n;i++){
          //  inner loop to print space
            for(int j=1;j<=n-i;j++){
                System.out.print( " ");
        }// inner looop ->star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Floyid  triangle
        /*for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" " );
                number++;
        }
            System.out.println();
        }*/
        /*  //reverse floyid
        for(int i=n;i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print(number+" " );
                number++;
        }
            System.out.println();
        }*/
        //print 0 1 half pyramid
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum %2 == 0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
    
                }
                
            }
            System.out.println();
        }*/
// butterfly pattern
//upper half
 /*  for(int i=1;i<=n;i++){
        //1 st half
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    //spaces
    int spaces = 2*(n-i);
    for(int j=1; j<=spaces; j++){
    System.out.print(" ");
    }
 //2nd  half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //1 st half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        //spaces
        int spaces = 2*(n-i);
        for(int j=1; j<=spaces; j++){
        System.out.print(" ");
        }
     //2nd  half
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }*/
//solid rombus
        /*  for (int i=1;i<=n;i++){
                //space
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();

            }*/
           /* //triangle
            for(int i =1;i<=n;i++){
                for( int j=1;j<n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i + "  ");
                }
                System.out.println();
            }*/
           // Palindrome
/*for(int i=1;i<=n;i++){
    //space
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=i;j>=1;j--){
        System.out.print( j );
    }
for(int j=2;j<=i;j++){
    System.out.print( j );
}
System.out.println();
}*/
//diamond
/*for(int i=1;i<=n;i++){
    //space
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print( "*");
    }
System.out.println();
}
for(int i=n;i>=1;i--){
    //space
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print( "*");
    }
System.out.println();
}*/

    }
}

