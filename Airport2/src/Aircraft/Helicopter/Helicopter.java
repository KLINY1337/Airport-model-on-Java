package Aircraft.Helicopter;

import Aircraft.Aircraft;
import Aircraft.Interface.AircraftOptions;

public class Helicopter extends Aircraft implements AircraftOptions {
    public Helicopter(String status, String type, String model) {
        super(status, type, model);
    }

    @Override
    public String parking() {
        this.status= Aircraft.Status.PARKING;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String steering() {
        this.status= Aircraft.Aircraft.Status.STEERING;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String stop_on_lane() {
        this.status= Aircraft.Aircraft.Status.STOP_ON_LANE;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String acceleration() {
        this.status= Aircraft.Aircraft.Status.ACCELERATION;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String takeoff() {
        this.status= Aircraft.Aircraft.Status.TAKEOFF;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String flight() {
        this.status= Aircraft.Aircraft.Status.FLIGHT;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }

    @Override
    public String landing() {
        this.status= Aircraft.Aircraft.Status.LANDING;
        String message="Status of "+model+" has switched to: "+status;
        System.out.println(message);
        return message;
    }
}
