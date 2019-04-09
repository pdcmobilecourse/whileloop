
package application;

import java.util.Scanner;


public class Application {

   
    public static void main(String[] args) {
//        
//       Scanner obj = new Scanner (System.in);
//        System.out.println("Enter A num :");
//       int a=obj.nextInt();
//       int factorial=a;
//        while(a>=2){
//        factorial=factorial*(a-1);
//        a--;}
//        System.out.println("Factorial = "+factorial);

//        int i=1;
//        while (i<4) {
//            int j =4;
//            while(j<7){
//                System.out.println(i+" "+j);
//                j++;
//            }
//            i++;
//        }
    
          int i=1;
          while(i<=5)
          {
              int j=1;
              while (j<=i) {
                  System.out.print("* ");
                  j++;
              }
              System.out.println();
              i++;
          }




    }

    }
    
}
