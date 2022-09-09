package EventGenerator;

import Aircraft.Airplane.Airplane;
import Aircraft.Helicopter.Helicopter;

public class EventGenerator {
    protected String id;

    public void createEventAirplane(String id, String status, String type, String model){
        this.id=id;
        Airplane plane=new Airplane(status, type, model);
    }

    public void createEventHelicopter(String id, String status, String type, String model){
        this.id=id;
        Helicopter heli=new Helicopter(status, type, model);
    }

}
