import Aircraft.Aircraft;
import Aircraft.Airplane.Airplane;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Airplane obj=new Airplane("LANDING","PASSENGER","BOEING737-800");
        obj.parking();
        obj.get_info();
        obj.steering();
        obj.get_info();
    }
}

// hello world