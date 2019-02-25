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
public class TravelAgencyClass {
   private AirlinerDirectory airlinerDirectory;
   private CustomerDirectory customerDirectory;
   private MasterFlightSchedule masterFlightSchedule;
   private FinalDirectory finalDirectory;
   
   public TravelAgencyClass(){
       airlinerDirectory = new AirlinerDirectory();
       customerDirectory = new CustomerDirectory();
       masterFlightSchedule = new MasterFlightSchedule();
       finalDirectory = new FinalDirectory();
   }

    public FinalDirectory getFinalDirectory() {
        return finalDirectory;
    }

    public void setFinalDirectory(FinalDirectory finalDirectory) {
        this.finalDirectory = finalDirectory;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public MasterFlightSchedule getMasterFlightSchedule() {
        return masterFlightSchedule;
    }

    public void setMasterFlightSchedule(MasterFlightSchedule masterFlightSchedule) {
        this.masterFlightSchedule = masterFlightSchedule;
    }
   
}
