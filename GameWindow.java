import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.net.URL;

public class GameWindow extends JPanel
{
  /*
  private JLabel infoLabel; //declares a label
  
  private JLabel achievementLabel; //declares a label
  private JPanel achievementPanel;   // declares a panel
  
  private JLabel skilLabel; //declares a label
  private JPanel skillPanel;   // declares a panel
  
  private JLabel buttonLabel; //declares a label
  */
  //panels
  private JPanel situationPanel;
  private JPanel buttonPanel;   // declares a panel
 
   private JLabel buttonLabel; //declares a label
   
  //situation
  private JLabel situationLabel;
  private JButton nextButton;
  private JButton backButton;
  
  private JButton yesButton;
  private JButton noButton;
  
  //sliders
  private JButton quitButton; // QUIT BUTTON buttonLabel
  
  
// 
// Constructor
// 
  public GameWindow()
  {
    // set this panel to a grid layout and change its color
    setLayout(new GridLayout(3,1,0,5));
    setBackground(Color.lightGray);
    
  
  
    // 
    // Situation Panel
    //    
    situationPanel = new JPanel();
    situationPanel.setBackground(Color.lightGray);
    add(situationPanel);
    situationLabel = new JLabel("");
    situationLabel.setText("<html><div style=\"textalign: center;\">"+"Achievements"+"</html>");
    situationLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    situationLabel.setForeground(Color.WHITE);
    situationPanel.add(situationLabel);
    
     backButton = new JButton("Back"); // quits game
    backButton.addActionListener(new ButtonListener());
    situationPanel.add(backButton);
    
    nextButton = new JButton("Next"); // quits game
    nextButton.addActionListener(new ButtonListener());
    situationPanel.add(nextButton);
    
    yesButton = new JButton("YES"); // quits game
    yesButton.addActionListener(new ButtonListener());
    situationPanel.add(yesButton);
    
    noButton = new JButton("NO"); // quits game
    noButton.addActionListener(new ButtonListener());
    situationPanel.add(noButton);
   
   
    // 
    // Button  Panel
    //    
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
