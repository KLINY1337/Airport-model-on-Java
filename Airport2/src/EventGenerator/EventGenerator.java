package EventGenerator;

import Aircraft.Airplane.Airplane;
import Aircraft.Helicopter.Helicopter;
import AirportDB.AirportDB;
import Terminal.Terminal;

public class EventGenerator {
    AirportDB database;
    Terminal terminal;
    public EventGenerator(AirportDB database, Terminal terminal){
        this.database = database;
        this.terminal=terminal;
    }

    public void createEventAirplane(String status, String type, String model, String city){

        Airplane plane=new Airplane(status, type, model);
        terminal.addEvent(plane, city,type);
    }

    public void createEventHelicopter(String status, String type, String model,String city){

        Helicopter heli=new Helicopter(status, type, model);
        terminal.addEvent(heli, city, type);
    }

}
