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
  private JPanel sidePanel;
  private JPanel backnextPanel;   // declares a panel
  private JPanel yesnoPanel;
 
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
    
    setBackground(Color.lightGray);
    
  
  
    // 
    // Situation Panel
    //    
    situationPanel = new JPanel();
   // situationPanel.setLayout(new BoxLayout(situationPanel, BoxLayout.PAGE_AXIS));
    situationPanel.setBackground(Color.lightGray);
    //add(situationPanel);
    
    situationLabel = new JLabel("");
    situationLabel.setText("<html><div style=\"textalign: center;\">"+"Situation:"+"</html>");
    situationLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    situationLabel.setForeground(Color.WHITE);
    situationPanel.add(situationLabel);
    
    //yesnoPanel
    yesnoPanel = new JPanel();
    yesnoPanel.setBackground(Color.black);
   // add(yesnoPanel);
    
    yesButton = new JButton("YES"); // quits game
    yesButton.addActionListener(new ButtonListener());
    yesnoPanel.add(yesButton);
    
    noButton = new JButton("NO"); // quits game
    noButton.addActionListener(new ButtonListener());
    yesnoPanel.add(noButton);
    
    //backnextPanel
    backnextPanel = new JPanel();
    backnextPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    backnextPanel.setBackground(Color.black);
   // add(backnextPanel);
    
    backButton = new JButton("Back"); // quits game
    backButton.addActionListener(new ButtonListener());
    backnextPanel.add(backButton);
    
    nextButton = new JButton("Next"); // quits game
    nextButton.addActionListener(new ButtonListener());
    backnextPanel.add(nextButton);
    
    
   
   
    // 
    // sidePanel
    //    
    sidePanel = new JPanel();
    sidePanel.setBackground(Color.black);
    //add(sidePanel);
    quitButton = new JButton("QUIT"); // quits game
    quitButton.addActionListener(new ButtonListener());
    sidePanel.add(quitButton);
    
    BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
    this.add(Box.createRigidArea(new Dimension(0, 50)));
    this.setLayout(layout);
    this.add(situationPanel);
    this.add(yesnoPanel);
    this.add(backnextPanel);
    
    
    this.add(Box.createRigidArea(new Dimension(0, 50)));
    
    /*
    //layout for back, next, yes, no buttons
    BoxLayout bnynlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
    this.add(Box.createRigidArea(new Dimension(0, 50)));
    this.setLayout(bnynlayout);
    this.add(yesnoPanel);
    this.add(backnextPanel);
    
    BoxLayout sidelayout = new BoxLayout(this, BoxLayout.Y_AXIS);
    this.add(Box.createRigidArea(new Dimension(0, 50)));
    this.setLayout(sidelayout);
    this.add(sidePanel);
    */
    
  //  this.add(sidePanel);
    
    
   
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
