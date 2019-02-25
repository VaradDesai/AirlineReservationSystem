/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busniess;

/**
 *
 * @author varad
 */
public class Airliner {
    private String airlinerName;
    private AirplaneDirectory airplaneDirectory;
    private FlightSchedule flightSchedule;
    
    public Airliner() {
       airplaneDirectory = new AirplaneDirectory();
       flightSchedule = new FlightSchedule();
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
   
    }
    
    @Override
    public String toString() {
        return airlinerName;
    }
}
