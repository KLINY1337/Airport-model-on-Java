package Aircraft;

public abstract class Aircraft {
    protected enum Status {PARKING, STEERING, STOP_ON_LANE, ACCELERATION, TAKEOFF, FLIGHT, LANDING};
    protected enum Type {CARGO, PASSENGER};

    protected Status status;
    protected Type type;
    protected String model;

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
            case "CARGO":
                this.type=Type.CARGO;
                break;
            case "PASSENGER":
                this.type=Type.PASSENGER;
                break;
            default:
                System.out.println("UNDEFINED TYPE OF AIRCRAFT");
                break;
        }

        this.model=model;
    }
}