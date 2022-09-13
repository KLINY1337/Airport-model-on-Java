package Terminal;

import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;
import AirportDB.AirportDB;
import logger.logger;
import AirportDB.FlightNote;
public class Terminal implements logger{
    private enum Status{OPEN, CLOSE};
    private Status status;
    private int peopleCurrent=0;
    protected AirportDB database;

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

    public void addEvent(Aircraft aircraft){
        FlightNote note=new FlightNote("1","1","1","1","1","1","1");
        database.add(note);
    }

    public void deleteEvent(String num){

    }
}
