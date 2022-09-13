import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;
import AirportDB.AirportDB;
import AppUI.AppUI;
import EventGenerator.EventGenerator;
import Terminal.Terminal;


public class Main {
    public static void main(String[] args) {

        AirportDB db = new AirportDB();
        Terminal terminal=new Terminal("OPEN",db);
        EventGenerator event = new EventGenerator(db,terminal);
        event.createEventAirplane("1","LANDING","PASSENGER","BOEING");
        db.printAll();

        AppUI app = new AppUI();
    }
}

// hello world