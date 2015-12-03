import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.net.URL;

public class GameGUI 
{
// ------------------------------------------
// Constructor
// ------------------------------------------
  
  public static void main(String [] args){
    
    JFrame frame = new JFrame ("Wah, wah, waaaahh....");
    // creates a new frame
    
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);    // makes a functional exit operation 
    
    JPanel pane = new JPanel(new GridBagLayout());
    pane.setBackground(Color.black);
    
    // adding the tabs which have panels to the tabbed panel
    pane.add (new LostWindow());

    frame.getContentPane().add(pane); // adding the pane to the frame
    frame.pack(); // unpacking what we need
    frame.setSize(750,450); //sets the size after unpacking
    frame.setResizable(false); //frame can no longer can be resized
    frame.setVisible(true); // make the frame/everything? visible
    
    
  }
}
