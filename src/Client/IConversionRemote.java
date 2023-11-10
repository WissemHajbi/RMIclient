package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversionRemote extends Remote {
    public double conversion (double valueToConvert) throws RemoteException;
}

