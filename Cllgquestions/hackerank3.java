package Cllgquestions;

import java.util.Scanner;
public class hackerank3 {
    
    public static void main(String args[])
    {
    System.out.println("Enter a no");

    Scanner s =  new Scanner(System.in);

    int a = s.nextInt();

    if(a % 2 != 0)
    {
        System.out.println("weird");
    }

    else  if(a >= 2 && a<=5)
    {
       System.out.println("not weird");
    }

    else if(a >=6 && a<= 20)
    {
        System.out.println("Weird");
    }

    else if(a > 20)
    {
       System.out.println("weird");
    }

    s.close();
    }
}
