import java.util.Scanner;

class numisposorneg{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER THE NUMBER : ");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println(n + " is positive number");
        }
        else if(n<=0){
            System.out.println(n + " is negative number");
        }
        else{
                  System.out.println(n + " is zero");
        }
    }
}