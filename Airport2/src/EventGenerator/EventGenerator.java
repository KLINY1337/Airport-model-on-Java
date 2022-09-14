package EventGenerator;

import Aircraft.Airplane.Airplane;
import Aircraft.Helicopter.Helicopter;
import AirportDB.AirportDB;
import Terminal.Terminal;

public class EventGenerator {
    AirportDB database;
    Terminal terminal;

    protected final double _plane_const = 0.9;
    //base of all possible props for random generation
    protected String[] _models_plane = {"BOEING 737-800", "BOEING 777-300", "AIRBUS A320-200", "AIRBUS A330-200", "AIRBUS A350-900", "AIRBUS A380-800", "SSJ-100", "Cessna 172", "Cessna 150"};
    protected String[] _models_helicopter = {"MI-8", "MI-24", "MI-26", "MI-28"};
    protected String[] _cities = {"Omsk", "Moscow", "Kazan", "Krasnodar", "Krasnoyarsk", "Novosibirsk", "Vladivostok", "Yekaterinburg", "Samara", "Rostov-on-Don", "Ufa", "Chelyabinsk", "Perm", "Khabarovsk", "Voronezh", "Nizhny Novgorod", "Volgograd", "Saratov", "Tyumen", "Izhevsk", "Kemerovo", "Orenburg", "Barnaul", "Tolyatti", "Ulan-Ude", "Irkutsk", "Yaroslavl", "Tomsk", "Kirov", "Kazan", "Krasnodar", "Krasnoyarsk", "Novosibirsk", "Vladivostok", "Yekaterinburg", "Samara", "Rostov-on-Don", "Ufa", "Chelyabinsk", "Perm", "Khabarovsk", "Voronezh", "Nizhny Novgorod", "Volgograd", "Saratov", "Tyumen", "Izhevsk", "Kemerovo", "Orenburg", "Barnaul", "Tolyatti", "Ulan-Ude", "Irkutsk", "Yaroslavl", "Tomsk", "Kirov"};
    protected String[] _aircraft_type = {"CARGO PLANE", "PASSENGER PLANE"};
    protected String[] _aircraft_type_heli = {"CARGO HELI", "PASSENGER HELI"};
    protected String[] _status = {"PARKING", "STEERING", "STOP_ON_LANE", "ACCELERATION", "TAKEOFF", "FLIGHT", "LANDING"};
    protected String[] _status_spawn = {"FLIGHT", "PARKING"};

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

    public void createRandomEvent(){
        double random = Math.random();
        if (random < _plane_const) {
            createEventAirplane(_status_spawn[(int) (Math.random() * _status_spawn.length)], _aircraft_type[(int) (Math.random() * _aircraft_type.length)], _models_plane[(int) (Math.random() * _models_plane.length)], _cities[(int) (Math.random() * _cities.length)]);
        } else {
            createEventHelicopter(_status_spawn[(int) (Math.random() * _status_spawn.length)], _aircraft_type_heli[(int) (Math.random() * _aircraft_type_heli.length)], _models_helicopter[(int) (Math.random() * _models_helicopter.length)], _cities[(int) (Math.random() * _cities.length)]);
        }
    }

}
