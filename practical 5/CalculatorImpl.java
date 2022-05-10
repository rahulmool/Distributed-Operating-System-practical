import java.rmi.*;
import java.rmi.server.*;


class CalculatorImpl extends UnicastRemoteObject implements Calculator{
    CalculatorImpl()throws RemoteException{}


    @Override
    public int getAddition(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return a + b;
    }
}
