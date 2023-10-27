import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("server_hostname", 1099);
            RemoteInterface remoteObject = (RemoteInterface) registry.lookup("RemoteObject");
            String message = remoteObject.sayHello();
            System.out.println("Message from server: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
