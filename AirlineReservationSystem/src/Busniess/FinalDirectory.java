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
public class FinalDirectory {
     private ArrayList<FinalDatabase> finalDict;
    
    public FinalDirectory() {
        finalDict = new ArrayList<FinalDatabase>();
    }

    public ArrayList<FinalDatabase> getFinalDict() {
        return finalDict;
    }
    
    public FinalDatabase addFinalDatabase() {
        FinalDatabase f = new FinalDatabase();
        finalDict.add(f);
        return f;
    }
    
    public void removeFinalDatabase(FinalDatabase f) {
        finalDict.remove(f);
    }
    
//    public final searchFinal(int id) {
//        for(Customer c : customerDict) {
//            if(c.getId() == id) {
//                return c;
//            }
//        }
//        return null;
//    }
}
