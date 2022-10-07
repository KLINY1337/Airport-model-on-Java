package Terminal;

import Aircraft.Aircraft;
import AirportDB.AirportDBmySQL;
import logger.logger;
import AirportDB.FlightNote;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
public class Terminal implements logger{
    private enum Status{OPEN, CLOSE};
    private Status status;
    private int peopleCurrent=0;
    protected AirportDBmySQL database;
    private int totalEvents=0;
    public Terminal(String status, AirportDBmySQL database){
        switch (status){
            case "OPEN":
                this.status=Status.OPEN;
                break;
            case "CLOSE":
                this.status=Status.CLOSE;
                break;
            default:
                String message="UNDEFINED STATUS OF TERMINAL";
                logger.log(message);
                break;
        }
        this.database=database;
    }

    public void addEvent(String flightCode, String eventType, String city, Aircraft aircraft) throws SQLException {
        String num=Integer.toString(totalEvents);
        this.totalEvents+=1;
        Date time=new Date();
        Timestamp dateOfEvent=new Timestamp(time.getTime());
        //FlightNote note=new FlightNote(num,type,city,time.toString(),aircraft.status.toString(),aircraft.type.toString(),aircraft.model);
        database.pasteAircraftStatus(flightCode, eventType, city, dateOfEvent, aircraft.status.toString(), aircraft.type.toString(), aircraft.model);

    }


//    public void deleteEvent(String num){
//        database.delete(num);
//    }
}
