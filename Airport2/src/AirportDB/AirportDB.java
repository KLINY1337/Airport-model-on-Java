package AirportDB;

import java.util.*;
//create class for sql database connection
public class AirportDB {

    protected ArrayList<Integer> hash;
    protected ArrayList<String> num;
    protected ArrayList<String> type;
    protected ArrayList<String> city;
    protected ArrayList<String> time;
    protected ArrayList<String> status;
    protected ArrayList<String> aircraft_type;
    protected ArrayList<String> model;

    //create objects for db fields
    public AirportDB() {
        hash = new ArrayList<Integer>();
        num = new ArrayList<String>();
        type = new ArrayList<String>();
        city = new ArrayList<String>();
        time = new ArrayList<String>();
        status = new ArrayList<String>();
        aircraft_type = new ArrayList<String>();
        model = new ArrayList<String>();
    }

    //add note to database
    public void add(String num, String type, String city, String time, String status, String aircraft_type, String model){
        this.hash.add(num.hashCode());
        this.num.add(num);
        this.type.add(type);
        this.city.add(city);
        this.time.add(time);
        this.status.add(status);
        this.aircraft_type.add(aircraft_type);
        this.model.add(model);
    }

    //delete note from database using
    public void delete(String num){
        int index = this.num.indexOf(num);
        this.hash.remove(index);
        this.num.remove(index);
        this.type.remove(index);
        this.city.remove(index);
        this.time.remove(index);
        this.status.remove(index);
        this.aircraft_type.remove(index);
        this.model.remove(index);
    }

    public boolean check_hash(int hash){
        return this.hash.contains(hash);
    }

    public void print_index(int index){
        System.out.println("Hash: "+hash.get(index));
        System.out.println("Num: "+num.get(index));
        System.out.println("Type: "+type.get(index));
        System.out.println("City: "+city.get(index));
        System.out.println("Time: "+time.get(index));
        System.out.println("Status: "+status.get(index));
        System.out.println("Aircraft type: "+aircraft_type.get(index));
        System.out.println("Model: "+model.get(index));
    }
}
