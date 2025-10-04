import java.util.Scanner;

public class STARPATTERN1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.print(" Enter the value : ");
         int n = sc.nextInt();
         for (int i=1;i<=n;i++){
            for( int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
         }

       sc.close();
    }
}


// Output
//  Enter the value : 5
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

//  Enter the value : 3
// * * *
// * * *
// * * *