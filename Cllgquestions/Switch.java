package Cllgquestions;
import java.util.Scanner ;

// memory leaks happens when scanner class is left open.
//You may close it but System.in also closes and you can not take further input then.

public class Switch {

    public static void main(String args[]) {
   System.out.println("Enter the month number");

   Scanner s  = new Scanner(System.in);
    int x = s.nextInt();

    switch(x)
    {                                            //Switch
        case 1:
        System.out.println("January");
        break;

        case 2:
        System.out.println("Feb");
        break;

        case 3:
        System.out.println("March");
        break;

        case 4:
        System.out.println("April");
        break;

        case 5:
        System.out.println("May");
        break;

        case 6:
        System.out.println("June");
        break;

        case 7:
        System.out.println("July");
        break;

        case 8:
        System.out.println("August");
        break;
  
        case 9:
        System.out.println("Sept");
        break;

        case 10:
        System.out.println("Octo");
        break;

        case 11:
        System.out.println("Nov");
        break;

        case 12:
        System.out.println("Dec");
        break;

    }
    // s.close();
    Scanner so  = new Scanner(System.in);
     int v ;
     v = so.nextInt();
     System.out.println("value :" +v);           

     so.close();      //closing one of the 2 memory leaks. Can be prevented by try-finally block !
    }
}
