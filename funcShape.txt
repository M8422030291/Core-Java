// Write a class with the name Perimeter using Function overloading that complete the perimeter of square,rectangle and circle
import java.util.Scanner;

public class shape {
    public int perimeter(int s)//Perimeter of a square
    {
      int a=4*s;
      return a;
    }
    public int perimeter(int l,int b)//Perimeter of a rectangle
    {
        int c=2*(l+b);
        return c;
    }
    public double perimeter(double r)//Perimeter of a circle
    {
       double d=2*(22.0/7)*r;
       return d;
    }

    public static void main(String[] args) {
        shape s=new shape();
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        double r;
        System.out.println("Enter side,length,breadth,radius");
        x= sc.nextInt();
        y= sc.nextInt();
        z= sc.nextInt();
        r= sc.nextDouble();
        System.out.println("Enter a Perimeter of Square: "+s.perimeter(x));
        System.out.println("Enter a Perimeter of rectangle :"+s.perimeter(x,y));
        System.out.println("Enter a Perimeter of Circle :"+s.perimeter(r));

    }

}