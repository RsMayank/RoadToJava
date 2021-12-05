import java.util.*;
public class Hello
{
    public static String getName()
    {
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        sc.close();
        return name;
    }
    public static void sayHello(String n)
    {
        System.out.println("Hello, "+ n);
        System.out.println("Have a good day!");
    }
    public static void main(String[] arg)
    {
        String name = getName();
        sayHello(name);
        
    }
}