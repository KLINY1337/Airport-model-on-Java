package AirportDB;

import java.util.*;
//create class for sql database connection

public class  AirportDB {

    // 1. hash - хэш номера полета
    // 2. num - номер полета
    // 3. type - тип полета прибытие или вылет
    // 4. city - цель полета
    // 5. time - время полета
    // 6. status - статус полета парковка/взлет/посадка/вылет...
    // 7. aircraft_type - тип самолета вертолет или самолет грузовой или пассажирский
    // 8. model - модель самолета B-777 / a-320 neo / MI-8 /....


    protected ArrayList<FlightNote> table;
    public AirportDB(){
        ArrayList<FlightNote> table = new ArrayList<FlightNote>();
        this.table=table;
    }
    public void add(FlightNote element){
        table.add(element);
    }

    public void delete(FlightNote element){
        table.remove(element);
    }

    public void delete(int index){
        table.remove(index);
    }

    public void delete(String num){
        for (int i = 0; i < table.size(); i++){
            if (table.get(i).num == num){
                table.remove(i);
            }
        }
    }

    public void deleteAll(){
        table.clear();
    }

    public void printAll(){
        for (int i = 0; i < table.size(); i++){
            table.get(i).printNote();
        }
    }


    public FlightNote get(int index){
        return table.get(index);
    }

    public FlightNote get(String num){
        for (int i = 0; i < table.size(); i++){
            if (table.get(i).num == num){
                return table.get(i);
            }
        }
        return null;
    }


    public int size(){
        return table.size();
    }

    public String[] getFieldsTable(){
        return new String[]{"num", "type", "city", "time", "status"};
    }



}
