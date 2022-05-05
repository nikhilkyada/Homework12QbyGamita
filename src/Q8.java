import java.util.Scanner;

public class Q8 {

//    ------------------------------------------------      User Define Method      ---------------------------
    public static void sum()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any one Number :");
        int input = scan.nextInt();
//-----------------------------------------------------    Temporary variable  ---------------------------------

        int output=0;

//---------------------------------------------------------For loop --------------------------------------
        // start at 1 ; i less then and equal to input = true ; i is increment by 1 every time
        for (int i = 1 ; i <= input ; i++)
        {
            output= output + i;          // output is equal to previous value output value + i
        }

        System.out.println(output);
    }

//========================================================   Main method =====================================
        public static void main (String args[]){

        sum();
        }
    }