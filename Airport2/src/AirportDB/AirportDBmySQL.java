package AirportDB;


import java.sql.*;

import logger.logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AirportDBmySQL implements logger {

    private String url;
    private String username;
    private String password;

    public AirportDBmySQL(){
        url="jdbc:mysql://localhost:3306/AirportDB";
        username="root";
        password="RootPassword-1337";
    }

    public Boolean checkConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(url,username,password)) {
            logger.log("CONNECTION TO " + url +": SUCCESS");
            connection.close();
            return true;
        }
    }

    public void pasteAircraftStatus(String flightCode, String eventType, String city, Timestamp dateOfEvent, String currentAircraftStatus, String aircraftType, String aircraftModel) throws SQLException {
        try(Connection connection = DriverManager.getConnection(url,username,password)) {
            Statement statement=connection.createStatement();
            String command= "INSERT aircraftstatus(FlightCode, EventType, City, DateOfEvent, CurrentAircraftStatus, AircraftType, AircraftModel) VALUES ('"+flightCode+"', '"+eventType+"', '"+city+"', '"+dateOfEvent+"', '"+currentAircraftStatus+"', '"+aircraftType+"', '"+aircraftModel+"')";
            statement.executeUpdate(command);
            connection.close();
            logger.log("TABLE aircraftstatus: UPDATED (PASTE)");
        }
    }

    public void pasteAircraftParking(int parkingPlace, String aircraftType, String aircraftModel) throws SQLException {
        try(Connection connection = DriverManager.getConnection(url,username,password)) {
            Statement statement=connection.createStatement();
            String command= "INSERT aircraftparking(ParkingPlace, AircraftType, AircraftModel) VALUES ('"+parkingPlace+"', '"+aircraftType+"', '"+aircraftModel+"')";
            System.out.println(command);
            statement.executeUpdate(command);
            connection.close();
            logger.log("TABLE aircraftparking: UPDATED (PASTE)");

        }
    }

    public void deleteAircraftStatus(String flightCode) throws SQLException{
        try(Connection connection = DriverManager.getConnection(url,username,password)){
            Statement statement = connection.createStatement();
            String command = "DELETE FROM aircraftstatus WHERE FlightCode = '"+flightCode+"'";
            statement.executeUpdate(command);
            connection.close();
            logger.log("TABLE aircraftstatus: UPDATED (DELETE)");
        }

    }

    public void deleteAircraftParking(int parkingPlace) throws SQLException{
        try(Connection connection=DriverManager.getConnection(url,username,password)){
            Statement statement=connection.createStatement();
            String command="DELETE FROM aircraftparking WHERE ParkingPlace = "+parkingPlace;
            statement.executeUpdate(command);
            connection.close();
            logger.log("TABLE aircraftparking: UPDATED (DELETE)");
        }
    }

//  where param = "ParkingPlace"; value = "SU1763"
    public JSONArray selectStatus(String table, String param, String value) throws SQLException {
        try(Connection connection  =  DriverManager.getConnection(url,username,password)){
            Statement statement=connection.createStatement();
            String command="SELECT * FROM "+table+" WHERE "+ param +" = '"+value+"'";
            System.out.println(command);
            ResultSet rs = statement.executeQuery(command);

            JSONArray json = new JSONArray();
            ResultSetMetaData rsmd = rs.getMetaData();
            while(rs.next()) {
                int numColumns = rsmd.getColumnCount();
                JSONObject obj = new JSONObject();
                for (int i=1; i<=numColumns; i++) {
                    String column_name = rsmd.getColumnName(i);
                    obj.put(column_name, rs.getObject(column_name));
                }
                json.add(obj);
            }
            connection.close();
            logger.log("TABLE aircraftstatus: SELECT "+param + " = " + value);
            return json;

        }
    }
}

//
