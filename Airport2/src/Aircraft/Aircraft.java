package Aircraft;

public abstract class Aircraft {
    public enum Status {PARKING, STEERING, STOP_ON_LANE, ACCELERATION, TAKEOFF, FLIGHT, LANDING};
    public enum Type {CARGO_HELI, PASSENGER_HELI, CARGO_PLANE, PASSENGER_PLANE};
    // type - прилет вылет
    // status - статус нормальный
    // aircraft_type - HELI
    // model
    public Status status;
    public Type type;
    public String model;

    public Aircraft(String status, String type, String model){
        switch (status) {
            case "PARKING":
                this.status = Status.PARKING;
                break;

            case "STEERING":
                this.status = Status.STEERING;
                break;

            case "STOP_ON_LANE":
                this.status = Status.STOP_ON_LANE;
                break;

            case "ACCELERATION":
                this.status = Status.ACCELERATION;
                break;

            case "TAKEOFF":
                this.status = Status.TAKEOFF;
                break;

            case "FLIGHT":
                this.status = Status.FLIGHT;
                break;

            case "LANDING":
                this.status = Status.LANDING;
                break;

            default:
                System.out.println("UNDEFINED STATUS OF AIRCRAFT!!!");
                break;
        }

        switch (type){
            case "CARGO HELI":
                this.type=Type.CARGO_HELI;
                break;
            case "PASSENGER HELI":
                this.type=Type.PASSENGER_HELI;
                break;
            case "CARGO PLANE":
                this.type=Type.CARGO_PLANE;
                break;
            case "PASSENGER PLANE":
                this.type=Type.PASSENGER_PLANE;
                break;
            default:
                System.out.println("UNDEFINED TYPE OF AIRCRAFT");
                break;
        }

        this.model=model;
    }
}