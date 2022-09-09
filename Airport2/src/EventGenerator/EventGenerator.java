package EventGenerator;

import Aircraft.Airplane.Airplane;
import Aircraft.Helicopter.Helicopter;
import AirportDB.AirportDB;

public class EventGenerator {
    protected String id;
    AirportDB database;

    public EventGenerator(AirportDB database){
        this.database = database;
    }

    public void createEventAirplane(String id, String status, String type, String model){
        this.id=id;
        Airplane plane=new Airplane(status, type, model);
    }

    public void createEventHelicopter(String id, String status, String type, String model){
        this.id=id;
        Helicopter heli=new Helicopter(status, type, model);
    }

}
