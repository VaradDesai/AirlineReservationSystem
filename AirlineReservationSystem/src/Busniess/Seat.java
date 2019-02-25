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
public class Seat {
   
   private boolean[][] isBooked;
   private String seatNumber;
   
   public Seat(){
       isBooked = new boolean[25][6];
   }
 //  private String seatNumber;

//    public boolean[][] getIsBooked() {
//        return isBooked;
//    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean[][] isIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean[][] isBooked) {
        this.isBooked = isBooked;
    }  
    
}
