/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busniess;

import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class FlightSchedule {
    private ArrayList<Flight> flightDict;
    
    public FlightSchedule() {
        flightDict = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightDict() {
        return flightDict;
    }
    
    public Flight addFlight() {
        Flight q = new Flight();
        flightDict.add(q);
        return q;
    }
     public Flight addtoMasterFlight(Flight flight) {
        
        flightDict.add(flight);
        return flight;
    }
    
    public void removeFlight(Flight q) {
        flightDict.remove(q);
    }
    
    public Flight searchFlight(String keyWord) {
        for(Flight s : flightDict) {
            if(keyWord.equals(s.getFlightNo())) {
                return s;
            }
        }
        return null;
    }
}
