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
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerDict;
    
    public AirlinerDirectory() {
        airlinerDict = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerDict() {
        return airlinerDict;
    }
    
    public Airliner addAirliner() {
        Airliner q = new Airliner();
        airlinerDict.add(q);
        return q;
    }
    
    public void removeAirliner(Airliner q) {
        airlinerDict.remove(q);
    }
    
    public Airliner searchAirliner(String keyWord) {
        for(Airliner s : airlinerDict) {
            if(keyWord.equals(s.getAirlinerName())) {
                return s;
            }
        }
        return null;
    }
}
