import java.util.Scanner;

public class Q10 {

    public static void main (String args[]) {
//--------------------------------------------------Taking user input --------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any one number to print its table :");
        int a = scan.nextInt();

        System.out.println("Table of " +a +":");

//        ----------------------------------------------For loop condition with equation ------------------------
        for (int i = 1 ; i <=10 ; i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
