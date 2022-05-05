import java.util.Scanner;

public class Q1{

    public void multi(){
    }
    //========================================MAin Method =========================================
    public static void main(String[] args){



        Scanner scan = new Scanner (System.in);

//-----------------------------------------   Taking Input   --------------------------------------------------

        System.out.println("Please Enter the  starting range . (Ex. 1) :");
        int input = scan.nextInt(); //1
        System.out.println( "Please Enter end range . (Ex. 10) :");
        int out = scan.nextInt();

//------------------------------------------     For loop ---------------------------------------------------
        //Printing number between range

        for (int i = input ; i <= out ; i++ ){
            System.out.println(i+"\n");

        }
    }
}
