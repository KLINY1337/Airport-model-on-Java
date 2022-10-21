import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;
import AirportDB.AirportDB;
import AppUI.AppUI;
import Application.Application;
import EventGenerator.EventGenerator;
import Terminal.Terminal;
import AirportDB.AirportDBmySQL;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import EventGenerator.EventGenerator;
import Terminal.Terminal;


public class Main {

    protected static long millis;
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException {
        Application app = new Application();
        app.startApp();
    }
}

//