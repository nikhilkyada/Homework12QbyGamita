public class Q9 {
    public static void main(String args[]) {
// - -----------------------------------------------Fixed variable a = 1 --------------------------------------
        int a = 1;

//---------------------------------------------------Divided by 3 conditions --------------------------------
        System.out.println("Divided by 3 :");
        for (int i = a; i <= 100; i++)
        {
            if (i % 3 ==0 )
            {
                System.out.print(i +", ");
            }
        }
 //--------------------------------------------------Divided by 5 conditions --------------------------------
        System.out.println("\n\nDivided by 5 :");
        for (int i = a ; i <=100 ; i++)
        {
            if (i % 5 == 0 )
            {
                System.out.print(i +", ");
            }
        }
    }//main end
}//class end
