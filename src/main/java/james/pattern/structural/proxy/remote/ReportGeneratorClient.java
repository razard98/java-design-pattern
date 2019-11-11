package james.pattern.structural.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ReportGeneratorClient {

    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();
    }

    private void generateReport() {

        IReportGenerator reportGenerator = null;

        try {
            reportGenerator = (IReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReport());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
