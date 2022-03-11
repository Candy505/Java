package Cllgquestions;

import java.util.Scanner;

public class count {
    public static void main(String args[])
    {
      System.out.println("Enter a number");
      
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();

     for(int i =1;i<=x;i++)
     {
         System.out.println("Next no  " + i);
     }

     s.close();
    }
}
