import devices.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

    Phone phone = new Phone("Samsung", "A5",15.0, "Android");
    URL url = new URL("NewApp","1.044", "donotinstallthis.com");
    phone.installAnnApp(url);
    phone.installAnApp("Bardzo kiepska aplikacja");
    phone.installAnApp("jescze gorsza aplikacja","1.2");
    phone.installAnnApp("nie chcesz tego instalować","2.34","najgorsze-apki.com");

    ArrayList<String> installList = new ArrayList();
    installList.add("JakaśKiepskaAplikacja");
    installList.add("Kalendarz");
    installList.add("BeFit");

    phone.installAnnApp(installList);

    Car diesel = new Diesel("VW","Golf",2000,1.0, 3000.0);
    diesel.refuel();

    Car electric = new Electric("tesla","X",2020, 1.0,10000.0);
    electric.refuel();

    Car lpg = new LPG("Fiat", "Panda", 2008, 1.8, 5000.0);
    lpg.refuel();

    }
}
