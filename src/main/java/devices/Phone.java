package devices;

import java.util.ArrayList;

public class Phone extends Device {

    public Double screenSize;
    public String androidIOS;
    public static final String DEFAULT_SERVER = "apps.android.com";
    public static final String DEFAULT_APP = "AndroidTools";
    public static final String DEFAULT_VERSION = "7.5A";

    public Phone(String producer, String model, Double screenSize, String androidIOS) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.androidIOS = androidIOS;
    }


    @Override
    public String toString() {
        return "devices.Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", androidIOS='" + androidIOS + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Ring! Ring! To ja, Twój telefon!");
    }

    public void installAnApp(String appName){
        System.out.println("Instaluję aplikację" + appName);
    }

    public void installAnApp(String appName, String version){
        System.out.println("Instaluję aplikację:" + appName + ", wersja: " + version);
    }

    public void installAnnApp(String appName, String version, String serverURL){
        System.out.println("Instaluję aplikację" + appName + ", versja: " + version + "z serwera: " + serverURL);
    }

    public void installAnnApp(ArrayList<String> appList) {
        for(String app : appList) {
            System.out.println("Instaluję aplikację: " + app);
        }
    }

    public void installAnnApp(URL url){
        System.out.println("Instaluje aplikację " + url.appName);
        System.out.println("wresja: " + url.appVersion);
        System.out.println("z serwera: " + url.serverURL);
    }



}
