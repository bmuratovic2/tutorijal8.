package ba.unsa.etf.rs.tutorijal8;

import java.util.ArrayList;
import java.util.Map;

public class TransportDAO {
    private static TransportDAO instance =null;

    public static TransportDAO getInstance() {
        if(instance==null) initialize();
        return instance;
    }

    private static void initialize() {
        instance= new TransportDAO();
    }

    public ArrayList<Bus> getBusses() {
        return null;
    }

    public ArrayList<Driver> getDrivers() {
        return null;
    }

    public void dodijeliVozacuAutobus(Driver driver, Bus bus, int which) {
    }

    public void deleteBus(Bus bus) {
    }

    public void deleteDriver(Driver driver) {
    }

    public void addBus(Bus bus) {
    }

    public Object addDriver(Driver driver) {
        return 0;
    }

    public void resetDatabase() {

    }
}
