// Write a program that prompts the user for an integer and prints the string
// "Orwell" if the number is exactly 1984.

package Cllgquestions;

import java.util.Scanner;

public class conditional {

    public static void main(String args[])
    {
        System.out.println("Enter an integer");

        Scanner s = new Scanner(System.in);

        int y = s.nextInt();

        if(y == 1984)
        System.out.println("Orwell");

        s.close();
    }
}