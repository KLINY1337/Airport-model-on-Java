import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;
import AirportDB.AirportDB;
import AppUI.AppUI;
import EventGenerator.EventGenerator;
import Terminal.Terminal;
import AirportDB.AirportDBmySQL;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;


public class Main {

    protected static long millis;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AirportDBmySQL db = new AirportDBmySQL();
        db.checkConnection();

//        AppUI app = new AppUI();
    }

    protected static void TimeTracker(){
        //get current time
        //get time of last event
        //if time of last event + 1 sec = current time
        //then create new event
        long millis_current = System.currentTimeMillis();

        if(millis_current-millis>=1000){
            millis=millis_current;
            logger.logger.log("TICK");
        }
    }
}
