import java.util.Scanner;

public class Q7 {

    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

//------------------------------------Capture 1st and 2nd value of User input  -------------------------------
        System.out.println("Enter any two numbers \n(Press Enter after entering 1st number and 2nd number ): ");
        int a = scan.nextInt();
        int b = scan.nextInt();

//-------------------------------------------------- Capture Operator ------------------------------------------
        System.out.println("Enter only one Operator (Ex. +,-,*,/)");
        char sym = scan.next().charAt(0);


//-------------------------------------------------------Switch ----------------------------------------------
        switch (sym) {
            case '+':
                System.out.println("Addition of " + a + "+" + b + " = " + (a + b));
                break;
            case '-' | '-':
                System.out.println("subtraction of " + a + "-" + b + " = " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of " + a + "*" + b + " = " + (a * b));
                break;
            case '/':
                System.out.println("Division of " + a + "/" + b + " = " + (a / b));
                break;

//--------------------------------------------------------Default Message -------------------------------------
            default:
                System.out.println("Please Enter valid Operator");
        }
    }
}
