
import java.util.Scanner;
public class squareofnumbers{
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a num n : ");
                        int n = sc.nextInt();
                      

                        int [] square = new int[n];
                        for (int i = 0; i < n; i++) {
                    
                            square[i] = (i+1)* (i+1);
                        }
                        System.out.println("The squares of the numbers are : ");
                        for (int num : square) {
                            System.out.println(num);

                    }
                }
            }

  