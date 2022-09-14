package Terminal;

import Aircraft.Aircraft;
import AirportDB.AirportDB;
import logger.logger;
import AirportDB.FlightNote;
import java.util.Date;
public class Terminal implements logger{
    private enum Status{OPEN, CLOSE};
    private Status status;
    private int peopleCurrent=0;
    protected AirportDB database;
    private int totalEvents=0;
    public Terminal(String status, AirportDB database){
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

    public void addEvent(Aircraft aircraft, String city, String type/*прилет вылет*/){
        String num=Integer.toString(totalEvents);
        this.totalEvents+=1;
        Date time=new Date();
        FlightNote note=new FlightNote(num,type,city,time.toString(),aircraft.status.toString(),aircraft.type.toString(),aircraft.model);
        database.add(note);
    }


    public void deleteEvent(String num){

    }
}
