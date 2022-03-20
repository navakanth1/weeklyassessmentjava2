import java.util.Scanner;
abstract class Shape
{
    int a,b;
    abstract public void printarea();
}
class rectangle extends Shape
{
    public int area_rect;
    public void printarea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length and breadth of rectangle");
        a=s.nextInt();
        b=s.nextInt();
        area_rect=a*b;
        System.out.println("Length of rectangle "+a +"breadth of rectangle "+b);
        System.out.println("The area ofrectangle is:"+area_rect);
    }
}
class square extends Shape
{
    double area_sqr;
    public void printarea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the side of square");
        a=s.nextInt();
        area_sqr=(a*a);
        System.out.println("The area of square is:"+area_sqr);
    }
}
class circle extends Shape
{
    double area_circle;
    public void printarea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        a=s.nextInt();
        area_circle=(3.14*a*a);
        System.out.println("Radius of circle"+a);
        System.out.println("The area of circle is:"+area_circle);
    }
}
