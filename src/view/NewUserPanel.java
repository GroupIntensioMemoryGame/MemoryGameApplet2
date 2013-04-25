package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewUserPanel extends JFrame implements ActionListener
{
    public NewUserPanel(){
        super("Create User");
        
        JPanel cUser1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20,50));
        
        JLabel lblName = new JLabel("Enter New Username:");
        final JTextField txtName = new JTextField(15);
        
        JButton createButton = new JButton("Create");
        createButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //add user to files
                // go to options menu
                String name = txtName.getText();
                OptionsPanel op = new OptionsPanel(name);
                setVisible(false);
            }
        });
        
        
        cUser1.add(lblName);
        cUser1.add(txtName);
        cUser1.add(createButton);
        cUser1.setBackground(Color.lightGray);
        createButton.setBackground(Color.ORANGE);
        
        // add to JFrame 
        add(cUser1);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
        
    }

}
