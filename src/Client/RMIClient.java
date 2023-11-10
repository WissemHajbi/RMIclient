// Importing necessary packages for RMI and exception handling
package Client;

import Service.IConversionRemote;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RMIClient {

    public static void main(String[] args) {
        try {
            // Looking up the remote object by its RMI URL
            IConversionRemote stub = (IConversionRemote) Naming.lookup("rmi://localhost:10909/ConversionObject");

            // Invoking remote methods and printing the results
            System.out.println("Conversion result for 7000.0: " + stub.conversion(7000.0));
            System.out.println("Conversion result for 60.0: " + stub.conversion(60.0));

        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            // Handling exceptions by throwing a runtime exception with the original exception as its cause
            throw new RuntimeException("Error in RMIClient", e);
        }
    }
}
