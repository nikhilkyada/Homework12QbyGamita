import java.util.Scanner;

public class Q6 {
    public static void main (String arg[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any number :");
        int input = scan.nextInt();  // .........................Capture user input
        int out = 0;

        //--------------------------------------------For loop---------------------------------
        for (int i = 1 ; i <= input ; i++)  // condition = i increment by 1 till input value is same or smaller
        {
            out=out+i;
        }
        System.out.println(out);  //........................ Print out
    }
}
