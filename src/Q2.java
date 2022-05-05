public class Q2 {
    //=====================================  Main Method   ======================================

    public static void main(String args[])
    {
//------------------------------------------  Fixed values  (a , b) ----------------------------------------------
    int a = 0;
    int b = 1;
    System.out.print(a+" "+b);


// ---------------------------       New variable c Declared  (c = a +b)    ------------------------
    int c;
    for (int i = 1 ; i <= 20 ; i++ )
    {
        // ---------------------------------repeated every time in loop  -----------------------------------
        c=a+b;
        //----------------------------------- Print c in every loop----------------------------------------
        System.out.print(" " + c );
        //-------------------------------   Swap the value of a and b in loop   -------------------------
        a=b;
        b=c;

    } // loop end
    } // main-method end
}     // Class end