//SituationTree

import javafoundations.*;
import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;


public class SituationTree {
  //instance variables
  private LinkedBinaryTree<Situation> mainTree;
  private Situation e1, e2, e3;
  
  public SituationTree() throws IOException{ //constructor if no files read in
    this.e1 = new Situation(1);//("e1 yes or no?","a1",1);
    this.e2 = new Situation(2); //left
    this.e3 = new Situation(3); //right
    /* 
     Situation e4 = new Situation("e2 no ->e4, yes or no?","a3",0);
     Situation e5 = new Situation("e2 yes ->e4, yes or no?","a3",0);
     Situation e6 = new Situation("e3 no ->e6, yes or no?","a3",0);
     Situation e7 = new Situation("e3 yes ->e7, yes or no?","a3",0);
     
     LinkedBinaryTree<Situation>  t1 = new LinkedBinaryTree<Situation>(test1); // use the first constructor 
     LinkedBinaryTree<Situation>  t2 = new LinkedBinaryTree<Situation>(test2); 
     LinkedBinaryTree<Situation>  t3 = new LinkedBinaryTree<Situation>(test3);
     mainTree = new LinkedBinaryTree<Situation>(test1, t2, t3); //LinkedBinaryTree (T element, LinkedBinaryTree<T> left,
     LinkedBinaryTree<T> right)
     
     */
    
    LinkedBinaryTree<Situation> n2, n3;//, n4, n5, n6, n7;
    
    
    // n4 = new LinkedBinaryTree<Situation>(e4); 
    
    // n5 = new LinkedBinaryTree<Situation>(e5);
    
    // n6 = new LinkedBinaryTree<Situation>(e6);
    
    // n7 = new LinkedBinaryTree<Situation>(e7);
    //n2 and n3 have to be placed here because n4 has to be initalized before n2 and n3 pass it as a parameter
     n2 = new LinkedBinaryTree<Situation>(e2);//2, n4, n5);
    
     n3 = new LinkedBinaryTree<Situation>(e3);//, n6, n7);
    
    mainTree = new LinkedBinaryTree<Situation>(e1, n2, n3);
    
  }
  
    
    public void traverse() 
    {
      LinkedBinaryTree<Situation> current = mainTree; 
      System.out.println("entered traverse() method");
      while (current.size() != 1) // while not a leaf
        
      {
        System.out.println(current.getRootElement()); 
        Scanner sc = new Scanner(System.in); // get user answer
        String str = sc.next();
//      System.out.println("["+str+"]"); toLowerCase())
        
        if (str.equalsIgnoreCase("no")) current = current.getLeft(); // change all text to lowercase
        if (str.equalsIgnoreCase("yes")) current = current.getRight();
      }
     System.out.println("current "+current.getRootElement()); 
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException{   
   
        
        SituationTree test = new SituationTree();
        //test.traverse();
        
      // System.out.println("e1: "+test.e1.getAchievement());
   
        //test.traverse();
      
      
      //testing from Situation.java
          //Situation one = new Situation(1);
          //System.out.println(one);
          //System.out.println("Image file name: "+ one.getImageFile());
    //System.out.println("Skill Point: "+ test.getSkillPoint());
    
   // System.out.println("Situations Array: "+ test.getSitArray(0));
    
   }
      
    }
  
