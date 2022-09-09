package AirportDB;

public class FlightNote {
    //hash for number of flight
    public Integer hash;
    //number of flight
    public String num;
    //type of flight arrival or departure

    public String type;
    //target city
    public String city;
    //schedule time
    public String time;
    //status of flight park/flight/land/takeoff...
    public String status;
    //aircraft type heli or plane cargo or plane passenger
    public String aircraft_type;
    // B-777 / a-320 neo / MI-8 /....
    public String model;

    public FlightNote(String num, String type, String city, String time, String status, String aircraft_type, String model){
        this.hash = num.hashCode();
        this.num = num;
        this.type = type;
        this.city = city;
        this.time = time;
        this.status = status;
        this.aircraft_type = aircraft_type;
        this.model = model;
    }

    public String[] getFieldsTable(){
        String[] fields = {num, type, city, time, status};
        return fields;
    }

    public void printNote(){
        for (int i = 0; i < getFieldsTable().length; i++){
            System.out.print(getFieldsTable()[i] + " ");
        }
    }

}
