package Service;

// Importing necessary RMI packages
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// The implementation of the IConversionRemote interface
public class IConversionImpl extends UnicastRemoteObject implements IConversionRemote {

    // Constructor for IConversionImpl, which throws RemoteException
    protected IConversionImpl() throws RemoteException {
        // Call to the constructor of the superclass (UnicastRemoteObject)
        super();
    }

    // Implementation of the conversion method from the remote interface
    @Override
    public double conversion(double valueToConvert) throws RemoteException {
        // Simple conversion logic (multiply by 3.3 in this case)
        return valueToConvert * 3.3;
    }
}
