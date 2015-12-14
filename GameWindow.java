import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.net.URL;
import java.util.*;


public class GameWindow extends JPanel
{
  
  //panels
  private JPanel imgPanel;
  private JPanel situationPanel;
  private JPanel quitPanel;
  private JPanel backnextPanel;   // declares a panel
  private JPanel yesnoPanel;
  private JPanel skillPanel;
  
  private JPanel sidePane;
  private JPanel rightPanel;
  
  //image
  JLabel imgLabel = new JLabel(new ImageIcon("jack.jpg"));
  
  JLabel profLabel = new JLabel(new ImageIcon("profile2.jpg"));
   
  
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
    skillPanel.setLayout(new BoxLayout(skillPanel, BoxLayout.Y_AXIS));
    
    skillPanel.setBackground(Color.black);
    
   
    dLabel = new JLabel("Drunkenness: 5");
    dLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    dLabel.setForeground(Color.WHITE);
    /*
    dskillLabel = new JLabel("");
    dskillLabel.setText("3");
    dskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    dskillLabel.setForeground(Color.RED);
    */
    pLabel = new JLabel("Power: 3");
    pLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    pLabel.setForeground(Color.WHITE);
    /*
    pskillLabel = new JLabel("");
    pskillLabel.setText("0");
    pskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    pskillLabel.setForeground(Color.RED);
    */
    cLabel = new JLabel("Charisma: 2");
    cLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    cLabel.setForeground(Color.WHITE);
    /*
    cskillLabel = new JLabel("");
    cskillLabel.setText("0");
    cskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    cskillLabel.setForeground(Color.RED);
    */
    
    iLabel = new JLabel("Intelligence: 1");
    iLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    iLabel.setForeground(Color.WHITE);
    /*
    iskillLabel = new JLabel("");
    iskillLabel.setText("0");
    iskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    iskillLabel.setForeground(Color.RED);
    */
    
    //adding image and labels to skillPanel
    skillPanel.add(profLabel);
    skillPanel.add(dLabel);
    
    //skillPanel.add(dskillLabel);
    Box.Filler dFill = new Box.Filler(new Dimension(5,15), 
                                       new Dimension(5,15), 
                                       new Dimension(5, 15));
    skillPanel.add(dFill);
     
    skillPanel.add(pLabel);
    //skillPanel.add(pskillLabel);
     //skillPanel.add((Box.createVerticalGlue()));
     Box.Filler pFill = new Box.Filler(new Dimension(5,15), 
                                       new Dimension(5,15), 
                                       new Dimension(5, 15));
     skillPanel.add(pFill);
    
    skillPanel.add(cLabel);
    //skillPanel.add(cskillLabel);
     Box.Filler cFill = new Box.Filler(new Dimension(5,15), 
                                       new Dimension(5,15), 
                                       new Dimension(5, 15));
    skillPanel.add(cFill);
    
    skillPanel.add(iLabel);
    //skillPanel.add(iskillLabel);
    
    /*
    JPanel skillvalPanel = new JPanel();
    skillvalPanel.setLayout(new BoxLayout(skillvalPanel, BoxLayout.Y_AXIS));
    skillvalPanel.setBackground(Color.black);
    
    dskillLabel = new JLabel("");
    dskillLabel.setText("3");
    dskillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    dskillLabel.setForeground(Color.RED);
    skillvalPanel.add(dskillLabel);
    
    */
    // 
    // quitPanel
    //    
    quitPanel = new JPanel();
    quitPanel.setBackground(Color.black);
    
    quitButton = new JButton("QUIT"); // quits game
    quitButton.addActionListener(new ButtonListener());
    quitPanel.add(quitButton);
    
    rightPanel = new JPanel();
    rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
    rightPanel.setBackground(Color.BLACK);
    rightPanel.add(imgPanel);
    rightPanel.add(situationPanel);
    rightPanel.add(backnextPanel);
    rightPanel.add(yesnoPanel);
    rightPanel.add(quitPanel);
  
    

    
    
    //add skillPanel to sidePane
    sidePane = new JPanel(new GridBagLayout());
    
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    sidePane.setBackground(Color.BLACK);

    
    //c.ipadx = 100;
   // c.ipady= 300;

    sidePane.add(skillPanel,c);
    
    //sidePane.add(skillvalPanel,c);
    add(sidePane);
    
    
    JPanel right= new JPanel(new GridBagLayout());
        right.setBackground(Color.BLACK);
    GridBagConstraints r = new GridBagConstraints();
    // r.fill = GridBagConstraints.VERTICAL;
   // r.ipadx =900;
    //r.ipady =500;
    
    right.add(rightPanel);
    
    add(right);
    
   this.setBackground(Color.BLACK);
    
    
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
  
  public static void main(String[] args){
    JFrame frame = new JFrame ("Wah, wah, waaaahh....");
    // creates a new frame
    
    
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);    // makes a functional exit operation 
    
    JPanel pane = new JPanel(new GridBagLayout());
    pane.setBackground(Color.BLACK);
    
    // adding the tabs which have panels to the tabbed panel
    pane.add (new GameWindow());
    
    frame.getContentPane().add(pane); // adding the pane to the frame
    frame.pack(); // unpacking what we need
    //frame.setSize(950,650); //sets the size after unpacking
    frame.setResizable(false); //frame can no longer can be resized
    frame.setVisible(true); // make the frame/everything? visible
    
    
  }
  
  
}
