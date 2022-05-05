import java.util.Scanner;

public class Q4 {

   //===========================================Main Method =========================================
    public static void main(String arg[]){

//-----------------------------------Scanner class object ----<------->-------Input from user ------
        Scanner scan = new Scanner( System.in);
        System.out.println("Enter the number, Which you want to reverse :");
        int no = scan.nextInt();

//--------------------------------------For loop ------------------------------------------------
        int rem ;int rev=0;

         for (int i = no ; no > 0 ; no=no/10){  // to reduce ,number need to go down

             rem= no%10;       //input divided by 10
             rev = rev*10 + rem;  // reverse is multiply by 10 + rem.

         }
         //---------------------------------------Print rev variable value -----------------------------
        System.out.println(rev);
    }
}
