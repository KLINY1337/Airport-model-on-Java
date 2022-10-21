package Application;

import AirportDB.AirportDBmySQL;
import EventGenerator.EventGenerator;
import Terminal.Terminal;
import java.sql.Timestamp;
import java.util.*;
import java.time.Clock;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import static java.lang.Thread.sleep;


public class Application {

    private AirportDBmySQL db;
    private Terminal terminal;
    private EventGenerator gen;

    private ArrayDeque<String> eventQueue;

    public void startApp() throws SQLException, ClassNotFoundException, InterruptedException {
        this.db = new AirportDBmySQL();
        db.checkConnection();
        Date date=new Date();
        long millis=date.getTime();

        this.terminal = new Terminal("OPEN",db);
        this.gen = new EventGenerator(db, terminal);
        this.eventQueue=new ArrayDeque<String>();

        while(true) {
//            if (date.getTime() - millis >= 1000) {
                millis = date.getTime();
                logger.logger.log("Trying create new event");
                Timestamp timestamp = new Timestamp(date.getTime());
                gen.tryCreateRandomEvent(eventQueue);
                terminal.handleEvent(eventQueue);

//            }
            Thread.sleep(1000);
        }
    }
}
