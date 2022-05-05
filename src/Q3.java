import java.util.Scanner;

public class Q3 {
    //prime number
    // divisible by 1 and itself only = prime number

    public static void main (String arg [])
    {

//---------------------------------------------User Input -------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter any number to check is it prime or not :");
        int a =scan.nextInt();

        // ----------------------------     Temporary variable -----------------------------------------

        int temp = 0;

//----------------------------------          For Loop          ---------------------------------------------
        for (int i=2 ; i <= a-1 ;i++)
        {
            if (a % i == 0)
            {
                temp = temp + 1;  // increment
            }
        } //loop End*************

// ------------------------------If Else condition  to print the number   ---------------------------
          if (temp == 0 )
         {
             System.out.println(a+ " is a prime number.");
         }
          else
         {
             System.out.println(a+ " is not a prime number.");
         }

    } // method end****************
}
