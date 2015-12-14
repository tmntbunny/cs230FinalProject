import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.net.URL;

public class WonWindow extends JPanel
{
  private JLabel infoLabel; //declares a label
  
  private JLabel achievementLabel; //declares a label
  private JPanel achievementPanel;   // declares a panel
  
  private JLabel skillLabel; //declares a label
  private JPanel skillpointPanel;   // declares a panel
  
 // private JLabel buttonLabel; //declares a label
  private JPanel buttonPanel;   // declares a panel
  
  private JButton replayButton;
  private JButton quitButton; // QUIT BUTTON buttonLabel
  
  
// 
// Constructor
// 
  public WonWindow()
  {
    // set this panel to a grid layout and change its color
    setLayout(new GridLayout(3,1,0,5));
    setBackground(Color.white);
    
    // initialize 3 panels, set their colors and add them to the main panel
   
    
    
    // 
    // First Panel
    //    

    setLayout(new GridLayout(0,1,0,70));
    setBackground(Color.black);
    
    infoLabel = new JLabel("<html><div style=\"textalign: center;\">"+"You've Won!"+"</html>"); //instantiates new JLabel
    infoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    infoLabel.setForeground(Color.WHITE);
    
    add(infoLabel); //adds this new JLabel
    
    
    
    // 
    // Achievement  Panel
    //    
    achievementPanel = new JPanel();
    achievementPanel.setBackground(Color.white);
    add(achievementPanel);
    achievementLabel = new JLabel("Achievements:");
    //achievementLabel.setText("<html><div style=\"textalign: center;\">"+"Achievements:"+"</html>");
    achievementLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    achievementLabel.setForeground(Color.black);
    achievementPanel.add(achievementLabel);
    
    // 
    // Skills  Panel
    //    
    skillpointPanel = new JPanel();
    skillpointPanel.setBackground(Color.white);
    add(skillpointPanel);
    skillLabel = new JLabel("Skills Points:");
    //skilLabel.setText("<html><div style=\"textalign: center;\">"+"Skills"+"</html>");
    skillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    skillLabel.setForeground(Color.black);
    skillpointPanel.add(skillLabel);
    
    
    // 
    // Button  Panel
    //    
    buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.black);
    add(buttonPanel);
    /*
    buttonLabel = new JLabel("");
    buttonLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    buttonLabel.setForeground(Color.WHITE);
    buttonPanel.add(buttonLabel);
    */
    
    // Buttons
    //quit
    quitButton = new JButton("QUIT"); // quits game
    quitButton.addActionListener(new ButtonListener());
    buttonPanel.add(quitButton);
    
    //replay
    replayButton = new JButton("RESTART");// closes current window and starts a new game from the instructions window
    replayButton.addActionListener(new ButtonListener());
    buttonPanel.add(replayButton);
//   
  }
  
      /**
     * ButtonListener is a private class for responding to button push events 
     */
    private class ButtonListener implements ActionListener {
      
      /** quits the game if quit button is pushed, changes the text of the buttons 
        **/
      public void actionPerformed (ActionEvent event) 
      {
        //quit button was pressed
      if (event.getSource() == quitButton) System.exit(0); 
      }
      
      
    }
    public static void main(String [] args){
    
    JFrame frame = new JFrame ("Wah, wah, waaaahh....");
    // creates a new frame
    
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);    // makes a functional exit operation 
    
    JPanel pane = new JPanel(new GridBagLayout());
    pane.setBackground(Color.black);
    
    // adding the tabs which have panels to the tabbed panel
    pane.add (new WonWindow());

    frame.getContentPane().add(pane); // adding the pane to the frame
    frame.pack(); // unpacking what we need
    frame.setSize(950,650); //sets the size after unpacking
    frame.setResizable(false); //frame can no longer can be resized
    frame.setVisible(true); // make the frame/everything? visible
    
    
  }
}
  
