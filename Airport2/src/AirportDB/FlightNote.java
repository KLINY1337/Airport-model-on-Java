package AirportDB;

public class FlightNote {
    public Integer hash;
    public String num;
    public String type;
    public String city;
    public String time;
    public String status;
    public String aircraft_type;
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

}
