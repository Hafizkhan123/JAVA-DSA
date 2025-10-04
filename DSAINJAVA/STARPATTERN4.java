// Program for star pattern 
//    * 
//   **
//  ***

import java.util.Scanner;

public class STARPATTERN4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.print(" Enter the value : ");
         int n = sc.nextInt();
         for (int i=1;i<=n;i++){
            for( int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
         }

       sc.close();
    }
}


