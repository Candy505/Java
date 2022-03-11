package Cllgquestions;
import java.util.Scanner  ;
class triangle
{
   int s1,s2,s3;

   void ch(int a,int b,int c)
   {
           s1= a; s2 =b; s3 =c;

           if(a==b && b ==c)
           System.out.println("Equivalent triangle");

           else if(a!=b && a!=c)
           System.out.println("Scalene triangle");
           
           else   
           System.out.println("Isoceles ");
          
   }
}
public class checkshape {
    public static void main(String args[])
    {
       triangle t;
     
       System.out.println("Enter the sides of triangle");

       Scanner s = new Scanner(System.in);
       int x = s.nextInt();
       int y = s.nextInt();
       int z = s.nextInt();

     t.ch(x,y,z);

     s.close();

    }
}
