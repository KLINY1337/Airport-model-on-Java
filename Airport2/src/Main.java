import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;
import AirportDB.AirportDB;
import AppUI.AppUI;
import EventGenerator.EventGenerator;
import Terminal.Terminal;
import AirportDB.AirportDBmySQL;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class Main {

    protected static long millis;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AirportDBmySQL db = new AirportDBmySQL();
        db.checkConnection();
        Date date=new Date();
        Timestamp timestamp=new Timestamp(date.getTime());
        //db.pasteAircraftStatus("SU1482","LANDING","OMSK", timestamp, "LANDING", "Airplane", "A380");
        //db.pasteAircraftParking(0,"Airplane", "A380");
        db.deleteAircraftParking(0);
        db.deleteAircraftStatus("SU1482");
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
