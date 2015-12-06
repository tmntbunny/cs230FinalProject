import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.net.URL;

public class LostWindow extends JPanel
{
  private JLabel infoLabel; //declares a label
  
  private JLabel achievementLabel; //declares a label
  private JPanel achievementPanel;   // declares a panel
  
  private JLabel skilLabel; //declares a label
  private JPanel skillPanel;   // declares a panel
  
  private JLabel buttonLabel; //declares a label
  private JPanel buttonPanel;   // declares a panel
  
  private JButton replayButton;
  private JButton quitButton; // QUIT BUTTON buttonLabel
  
  
// ------------------------------------------
// Constructor
// ------------------------------------------
  public LostWindow()
  {
    // set this panel to a grid layout and change its color
    setLayout(new GridLayout(3,1,0,5));
    setBackground(Color.lightGray);
    
    // initialize 3 panels, set their colors and add them to the main panel
   
    
    
    // ---------
    // First Panel
    // ---------   

    setLayout(new GridLayout(0,1,0,70));
    setBackground(Color.black);
    
    infoLabel = new JLabel("<html><div style=\"text-align: center;\">"+"You've lost!"+"</html>"); //instantiates new JLabel
    infoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    infoLabel.setForeground(Color.WHITE);
    add(infoLabel); //adds this new JLabel
    
    // ---------
    // Achievement  Panel
    // ---------   
    achievementPanel = new JPanel();
    achievementPanel.setBackground(Color.lightGray);
    add(achievementPanel);
    achievementLabel = new JLabel("");
    achievementLabel.setText("<html><div style=\"text-align: center;\">"+"Achiemvents"+"</html>");
    achievementLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    achievementLabel.setForeground(Color.WHITE);
    achievementPanel.add(achievementLabel);
    
    // ---------
    // Skills  Panel
    // ---------   
    skillPanel = new JPanel();
    skillPanel.setBackground(Color.black);
    add(skillPanel);
    skilLabel = new JLabel("");
    skilLabel.setText("<html><div style=\"text-align: center;\">"+"Skills"+"</html>");
    skilLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    skilLabel.setForeground(Color.WHITE);
    skillPanel.add(skilLabel);
    
    
    // ---------
    // Button  Panel
    // ---------   
    buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.black);
    add(buttonPanel);
    buttonLabel = new JLabel("");
    buttonLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    buttonLabel.setForeground(Color.WHITE);
    buttonPanel.add(buttonLabel);
    
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
}
  
