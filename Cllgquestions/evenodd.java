package Cllgquestions;
import java.util.Scanner ;
public class evenodd {
    public static void main(String args[])
    {
        System.out.println("Enter the number to be checked");

        int a;
    
        Scanner san = new Scanner(System.in);
       
        a = san.nextInt();

if(a %2 == 0)

    System.out.println("Even");
else
System.out.println("Odd");

    }
}

  