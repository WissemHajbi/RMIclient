package Service;
// Importing necessary RMI packages
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// The RMIServer class responsible for setting up and running the RMI server
public class RMIServer {
    public static void main(String[] args) {
        try {
            // Creating a RMI registry on port 10909
            LocateRegistry.createRegistry(10909);

            // Creating an instance of the IConversionImpl class (the remote object)
            IConversionImpl od = new IConversionImpl();

            // Printing information about the created remote object
            System.out.println("Remote object details: " + od.toString());

            // Binding the remote object to the RMI registry with the specified name and URL
            Naming.rebind("rmi://localhost:10909/ConversionObject", od);

        } catch (Exception e) {
            // Handling exceptions by printing the stack trace
            e.printStackTrace();
        }
    }
}
