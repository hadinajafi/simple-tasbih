/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasbih;
import java.util.Random;
/**
 *
 * @author hadi
 */
public class Estexare {
    private Random random;
    private String[] aspects;
    public Estexare() {
        random = new Random();
        aspects = new String[5];
        setAspects();
        
    }
    public String generate(){
        int limit = random.nextInt(5);
        switch (limit){
            case 0:
                return aspects[0];
            case 1:
                return aspects[1];
            case 2:
                return aspects[2];
            case 3:
                return aspects[3];
            default:
                return aspects[4];  
        }
    }

    public void setAspects() {
        aspects[0] = "Very Good";
        aspects[1] = "Good";
        aspects[2] = "Middle";
        aspects[3] = "Bad";
        aspects[4] = "Very Bad";
    }
    
}
