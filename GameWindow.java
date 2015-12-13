import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.net.URL;
import java.util.*;


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
  private JPanel imgPanel;
  private JPanel situationPanel;
  private JPanel quitPanel;
  private JPanel backnextPanel;   // declares a panel
  private JPanel yesnoPanel;
  private JPanel skillPanel;

  //image
  JLabel imgLabel = new JLabel(new ImageIcon("jack.jpg"));
  
   
  //situation
  private JLabel situationLabel;
  private JButton nextButton;
  private JButton backButton;
  
  private JButton yesButton;
  private JButton noButton;
  
  //quit button
  private JButton quitButton; // QUIT BUTTON buttonLabel
  
  
  //skill names
  private JLabel dLabel;
  private JLabel pLabel;
  private JLabel cLabel;
  private JLabel iLabel;
  
  //skill values
  private JLabel dskillLabel;
  private JLabel pskillLabel;
  private JLabel cskillLabel;
  private JLabel iskillLabel;
// 
// Constructor
// 
  public GameWindow()
  {
    // set this panel to a grid layout and change its color
    
   // setBackground(Color.lightGray);
    
  //img Panel
    imgPanel = new JPanel();
    imgPanel.setBackground(Color.black);
    imgPanel.add(imgLabel);
  
    // 
    // Situation Panel
    //    
    situationPanel = new JPanel();
   // situationPanel.setLayout(new BoxLayout(situationPanel, BoxLayout.PAGE_AXIS));
    situationPanel.setBackground(Color.black);
    //add(situationPanel);
    
    situationLabel = new JLabel("");
    situationLabel.setText("<html><div style=\"text-align: left;\">"+"Do you suck Sherlock's blood?"+"</html>");
    situationLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
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
    
    //filler spacing between next and back button
    Box.Filler hFill = new Box.Filler(new Dimension(200,0), 
                                 new Dimension(300, 0), 
                                 new Dimension(500, 0));
    backnextPanel.add(hFill);
    
    nextButton = new JButton("Next"); // quits game
    nextButton.addActionListener(new ButtonListener());
    backnextPanel.add(nextButton);
    
    //skillPanel

    skillPanel = new JPanel();
    skillPanel.setBackground(Color.black);
   
    dLabel = new JLabel("Drunkenness:");
    dLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    dLabel.setForeground(Color.WHITE);
    
    dskillLabel = new JLabel("");
    dskillLabel.setText("3");
    dskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    dskillLabel.setForeground(Color.RED);
    
    pLabel = new JLabel("Power:");
    pLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    pLabel.setForeground(Color.WHITE);
    
    pskillLabel = new JLabel("");
    pskillLabel.setText("0");
    pskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    pskillLabel.setForeground(Color.RED);

    cLabel = new JLabel("Charisma:");
    cLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    cLabel.setForeground(Color.WHITE);
    
    cskillLabel = new JLabel("");
    cskillLabel.setText("0");
    cskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    cskillLabel.setForeground(Color.RED);

    
    iLabel = new JLabel("Intelligence:");
    iLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    iLabel.setForeground(Color.WHITE);
    
    iskillLabel = new JLabel("");
    iskillLabel.setText("0");
    iskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    iskillLabel.setForeground(Color.RED);

         
 
   
    //adding labels to skillPanel
    skillPanel.add(dLabel);
    skillPanel.add(dskillLabel);
    Box.Filler dFill = new Box.Filler(new Dimension(10,0), 
                                 new Dimension(10, 0), 
                                 new Dimension(10, 0));
    skillPanel.add(dFill);
    
    skillPanel.add(pLabel);
    skillPanel.add(pskillLabel);
    Box.Filler pFill = new Box.Filler(new Dimension(10,0), 
                                 new Dimension(10, 0), 
                                 new Dimension(10, 0));
    skillPanel.add(pFill);
    
    skillPanel.add(cLabel);
    skillPanel.add(cskillLabel);
    Box.Filler cFill = new Box.Filler(new Dimension(10,0), 
                                 new Dimension(10, 0), 
                                 new Dimension(10, 0));
    skillPanel.add(cFill);
    
    skillPanel.add(iLabel);
    skillPanel.add(iskillLabel);

   
   
    // 
    // quitPanel
    //    
    quitPanel = new JPanel();
    quitPanel.setBackground(Color.black);
 
    quitButton = new JButton("QUIT"); // quits game
    quitButton.addActionListener(new ButtonListener());
    quitPanel.add(quitButton);

    
    
    
    BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);

    this.setLayout(layout);

    this.add(skillPanel);
    
    this.add((Box.createHorizontalGlue()));
    this.add(imgPanel);
    this.add(situationPanel);
    this.add((Box.createHorizontalGlue()));
    this.add(backnextPanel);
    this.add(yesnoPanel);
    this.add(quitPanel);

  


    
    
    //this.add(Box.createRigidArea(new Dimension(0, 50)));
    
    /*
    //layout for back, next, yes, no buttons
    BoxLayout bnynlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
    this.add(Box.createRigidArea(new Dimension(0, 50)));
    this.setLayout(bnynlayout);
    this.add(yesnoPanel);
    this.add(backnextPanel);
    
    BoxLayout sidelayout = new BoxLayout(this, BoxLayout.Y_AXIS);
    this.add(Box.createRigidArea(new Dimension(20, 50)));
    this.setLayout(sidelayout);
    this.add(sidePanel);
    
   */

  //  this.add(sidePanel);
     /*try {
    BufferedImage img = ImageIO.read(new File("jack.jpg"));

    ImageIcon icon = new ImageIcon(img);
    JLabel label = new JLabel(icon);
     this.add(label);
      } catch (IOException e) {
         System.out.println("exception");
      }
   
   */
    
   
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
