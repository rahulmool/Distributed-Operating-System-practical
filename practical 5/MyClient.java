
import java.rmi.*;
import java.util.Scanner;
public class MyClient{
public static void main(String args[])throws Exception{
Calculator c=(Calculator)Naming.lookup("rmi://localhost:6666/calc");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    System.out.println("Addition is: "+c.getAddition(a, b));
    sc.close();
}
}
