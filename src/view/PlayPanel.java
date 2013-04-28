package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.ISimonSaysObserver;
import model.Player;
import model.SimonSays;
import controller.SimonSaysController;

public class PlayPanel extends JFrame implements ActionListener, ISimonSaysObserver
{
    public PlayPanel(Player player, int numObjects, String layout, int size, ArrayList<String> colors, ArrayList<String> shapes, final SimonSaysController sscgame){
        super("Simon Says");
        
        sscgame.play(player, shapes, colors, numObjects, this);

        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(SimonSays ss)
    {
        // TODO Auto-generated method stub
        
    }

}
