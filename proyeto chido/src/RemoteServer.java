import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServer extends UnicastRemoteObject implements RemoteInterface {
    public RemoteServer() throws RemoteException {
        // Constructor
    }

    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }
}
