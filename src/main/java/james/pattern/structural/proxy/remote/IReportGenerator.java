package james.pattern.structural.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IReportGenerator extends Remote {

    public String generateDailyReport() throws RemoteException;

}
