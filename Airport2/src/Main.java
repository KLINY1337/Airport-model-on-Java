import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;
import AirportDB.AirportDB;
import EventGenerator.EventGenerator;


public class Main {
    public static void main(String[] args) {

        AirportDB db = new AirportDB();
        EventGenerator event = new EventGenerator(db);

        System.out.println("Hello world!");
        Airplane obj=new Airplane("LANDING","PASSENGER","BOEING737-800");

    }
}

// hello world