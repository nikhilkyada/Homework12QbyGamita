import java.util.Scanner;

public class Q5 {
    //==========================================Main Method =======================================
      public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any one number :");  //Display message
        int input = scan.nextInt();  //Capture user input
        int output = 1;

//-------------------------------------------For loop ----------------------------------------------
        for (int i = input ; i >= 1 ; i--)   // Start from big value and decrement till 1.
        {
            output= output * i ;  // multiplication
        }

//--------------------------------------------Print out -------------------------------------------
        System.out.println(output);
    }
}
