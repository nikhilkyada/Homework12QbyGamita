import java.util.Scanner;

public class Q11 {
    public static void count () {
//====================================================Requesting Sentence and finding char-rector ==================
        Scanner scan = new Scanner(System.in);
        System.out.println("Write any sentence :");
        String s = scan.next();
       s += scan.nextLine();

        int c = 0;
        System.out.println("Enter only one character to find :");
        char findingOfCharactor =scan.next().charAt(0);

//<-------------------------------------------------For loop ----------------------------------------->
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == findingOfCharactor)   //<----------------------count a corrector--------------------->
            {
                c = c + 1;   // <-----------------------increasing value by 1----------------->
            }
        }
//=================================================Print count ======================================
        System.out.println(c);
    }
//=======================================================MAin method ======================================
        public static void main (String args []){
          count();
        }
    }
