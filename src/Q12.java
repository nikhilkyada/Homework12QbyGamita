import java.util.Scanner;

public class Q12 {

    //==============================================Capture user input 1st 2nd 3rd ===========================
    public static void main (String arg[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = scan.nextInt();
        System.out.println("Enter 2nd number :");
        int b = scan.nextInt();
        System.out.println("Enter 3rd number :");
        int c = scan.nextInt();

//====================================================If else conditions =====================================

        if (a >b && a >c)   //    <---------------- 1 st is bigger then 2nd and 3rd = true ------------>
        {
            System.out.println(a+ " is Grater.");
        }
        else if (b>a && b>c)    // <-----------------2nd is bigger then 1st and 3rd = true------------->
        {
            System.out.println(b+ " is Grater.");
        }
        else                   //  <--------------------If both are false then 3rd is only left ---------->
        {
            System.out.println(c+ " is Grater.");
        }
    }
}
