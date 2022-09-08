package Aircraft.Airplane;

import Aircraft.Aircraft;
import Aircraft.Interface.AircraftOptions;

import java.io.IOException;

public class Airplane extends Aircraft implements AircraftOptions {

    public Airplane(String status, String type, String model) {
        super(status, type, model);
    }

    @Override
    public String parking() {
        this.status=Status.PARKING;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String steering() {
        this.status=Status.STEERING;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String stop_on_lane() {
        this.status=Status.STOP_ON_LANE;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String acceleration() {
        this.status=Status.ACCELERATION;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String takeoff() {
        this.status=Status.TAKEOFF;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String flight() {
        this.status=Status.FLIGHT;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String landing() {
        this.status=Status.LANDING;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String get_info(){
        String message="Airplane info: "+status+" "+type+" "+model;
        System.out.println(message);
        return message;
    }
}
