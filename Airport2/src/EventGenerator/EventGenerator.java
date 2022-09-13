package EventGenerator;

import Aircraft.Airplane.Airplane;
import Aircraft.Helicopter.Helicopter;
import AirportDB.AirportDB;
import Terminal.Terminal;

public class EventGenerator {
    protected String id;
    AirportDB database;
    Terminal terminal;
    public EventGenerator(AirportDB database, Terminal terminal){
        this.database = database;
        this.terminal=terminal;
    }

    public void createEventAirplane(String id, String status, String type, String model){
        this.id=id;
        Airplane plane=new Airplane(status, type, model);
        terminal.addEvent(plane);
    }

    public void createEventHelicopter(String id, String status, String type, String model){
        this.id=id;
        Helicopter heli=new Helicopter(status, type, model);
        terminal.addEvent(heli);
    }

}
