
/**
 * Write a description of class CalcualtionsV4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcualtionsV4
{public static void main(String[ ] args)
    {
        int iNum1=25;
        int iNum2=9;
        int iNum3=16;
  
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + "plus" + iNum2+"=");
        System.out.println(iNum1+ iNum2);
        System.out.println("43.21 plus 3.14 equals" + (43.21 + 3.14 + 5.0));
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 +"minus" +iNum2 +"minus" +iNum1+"=");
        System.out.println(iNum3- iNum2- iNum1); 
        System.out.println( 3.14 - 5.0 );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum1 +"times" + iNum2+"="); 
        System.out.println(iNum1* iNum2);
        System.out.println("3.14 times 5.0 times 5.0 equals"+ (3.14 * 5.0 * 5.0));
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum2+ "divide"+ iNum1+ "=" );
        System.out.println(9 / 25);
        System.out.println("43.21 divide 5.0 equals" + (43.21 / 5.0) );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum3 +"modulus"+ iNum2 +"=");
        System.out.println(16 % 9 );
        System.out.println("5.0 modulus 3.14 equals"+ (5.0 % 3.14));
        //System.out.println();
        
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
         System.out.println("-10");
        // 234 minus (234 divided by 6 modulus 12) + 3
         System.out.println("234");
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println("3.2");
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println("100");
        // 2.03 Additional int Equations
        //Addition system.out.println("Addition");
        System.out.println("22 plus 4 equals" + (22+4));
        System.out.println();
        
        //2.04 Additional double Equations
        System.out.println(iNum1 + "plus" + iNum2 + "modulus" + iNum3 + "=");
        System.out.print( 25 + 9 % 16);
        System.out.println(iNum3 + "minus" + iNum1 + "divide" + iNum2 + "times" + iNum3);
        System.out.print(16 - 25 / 9 * 16);
               
    } // end of main methodmethod
}
