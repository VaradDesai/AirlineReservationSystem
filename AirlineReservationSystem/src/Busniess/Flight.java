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
public class Flight {
  private String FlightNo;
  private String From;
  private String To;
  private Double Time;
  private String Date;
  private Seat seat;

    
  //private Seat[][] set;
  private Airplane airplane;
  public Flight(){
      //set = new Seat[25][6];
      seat = new Seat();
      airplane = new Airplane();
  }

//    public Seat[][] getSet() {
//        return set;
//    }
//
//    public void setSet(Seat[][] set) {
//        this.set = set;
//    }
  
    public String getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(String FlightNo) {
        this.FlightNo = FlightNo;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }
public Double getTime() {
        return Time;
    }

    public void setTime(Double Time) {
        this.Time = Time;
    }      

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

 

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
    

    
  
    
  
     @Override
         public String toString() {
        return this.getFlightNo();
    }
}
