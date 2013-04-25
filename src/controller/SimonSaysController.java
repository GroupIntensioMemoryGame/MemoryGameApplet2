package controller;

import model.SimonSays;
import model.Player;

public class SimonSaysController {
    
    private SimonSays ss;
    
    public SimonSaysController(){
        
    }
    
    public SimonSays getGame(){
        return ss;
    }
    
    public void play(Player p, int numObjects){
        ss = new SimonSays(p, numObjects);
        ss.increaseSequence();
    }
    
    public void compareSequence(int input){
        if(ss.compareInput(input)){
            ss.increaseCurIndex();
        }
        else{
            ss.endGame(ss.getRoundNumber());
        }
    }
}
