package james.pattern.structural.proxy.remote;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ReportGeneratorImpl extends UnicastRemoteObject implements IReportGenerator, Serializable{


    private static final long serialVersionUID = 5813009736421197589L;

    protected ReportGeneratorImpl() throws RemoteException {

    }

    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("****************** Location X Daily Report ******************");
        sb.append("\\n Locatioin ID: 012");
        sb.append("\\n Today's Date:" + new Date());
        sb.append("\\n Total Pizza's Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Total Profit: $1985");
        sb.append("**************************************************************");

        return sb.toString();
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {

        IReportGenerator reportGenerator = new ReportGeneratorImpl();
        Naming.rebind("PizzaCoRemoteGenerator", reportGenerator);
    }
}
