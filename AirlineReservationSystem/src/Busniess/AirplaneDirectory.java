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
public class AirplaneDirectory {
    private ArrayList<Airplane> airplaneDict;
    
    public AirplaneDirectory() {
        airplaneDict = new ArrayList<Airplane>();
    }

    public ArrayList<Airplane> getAirplaneDict() {
        return airplaneDict;
    }
    
    public Airplane addAirplane() {
        Airplane q = new Airplane();
        airplaneDict.add(q);
        return q;
    }
    
    public void removeAirplane(Airplane q) {
        airplaneDict.remove(q);
    }
    
    public Airplane searchAirplane(String keyWord) {
        for(Airplane s : airplaneDict) {
            if(keyWord.equals(s.getAirplaneName())) {
                return s;
            }
        }
        return null;
    }
}
