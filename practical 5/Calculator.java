import java.rmi.*;
interface Calculator extends Remote{
public int getAddition(int a, int b)throws RemoteException;
}
