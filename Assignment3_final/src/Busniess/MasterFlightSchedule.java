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
public class MasterFlightSchedule {
    private FlightSchedule flightSchedule;
    
    public MasterFlightSchedule(){
        flightSchedule = new FlightSchedule();
        
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
}
