import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObject = new RemoteServer();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("RemoteObject", remoteObject);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
