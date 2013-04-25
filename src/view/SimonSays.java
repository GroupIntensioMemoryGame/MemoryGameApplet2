package view;

import java.applet.Applet;
import javax.swing.SwingUtilities;
import javax.swing.JApplet;

public class SimonSays extends Applet
{
    public void init(){
        try {
            SwingUtilities.invokeAndWait(new Runnable(){
                public void run(){
                    createGUI();
                }
            });
        } catch (Exception e){
            System.err.println("createGUI didn't complete successfully");
        }
    }
    
    private void createGUI(){
        LoginPanel login = new LoginPanel();
    }
}

