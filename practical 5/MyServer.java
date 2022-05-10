import java.rmi.*;
import java.rmi.registry.LocateRegistry;
public class MyServer{
public static void main(String args[])throws Exception{
    Remote r = new CalculatorImpl();
    LocateRegistry.createRegistry(6666);
    Naming.rebind("rmi://localhost:6666/calc",r);
    System.out.println("Server Started");
}
}
