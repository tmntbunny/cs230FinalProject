//SituationTree

import javafoundations.*;
import java.util.Scanner;

public class SituationTree{
  
 private LinkedBinaryTree<Situation> mainTree;
  
  public SituationTree(){
    Situation e1 = new Situation("e1 yes or no?","a1",1);
    Situation e2 = new Situation("e1 no -> e2 yes or no?","a2",-1); //left
    Situation e3 = new Situation("e1 yes ->e3, yes or no?","a3",0); //right
    
    Situation e4 = new Situation("e2 no ->e4, yes or no?","a3",0);
    Situation e5 = new Situation("e2 yes ->e4, yes or no?","a3",0);
    Situation e6 = new Situation("e3 no ->e6, yes or no?","a3",0);
    Situation e7 = new Situation("e3 yes ->e7, yes or no?","a3",0);
/*    
    LinkedBinaryTree<Situation>  t1 = new LinkedBinaryTree<Situation>(test1); // use the first constructor 
    LinkedBinaryTree<Situation>  t2 = new LinkedBinaryTree<Situation>(test2); 
    LinkedBinaryTree<Situation>  t3 = new LinkedBinaryTree<Situation>(test3);
    mainTree = new LinkedBinaryTree<Situation>(test1, t2, t3); //LinkedBinaryTree (T element, LinkedBinaryTree<T> left,
                           LinkedBinaryTree<T> right)
  
  */
   
     LinkedBinaryTree<Situation> n2, n3, n4, n5, n6, n7;
    
   
     n4 = new LinkedBinaryTree<Situation>(e4); 
    
     n5 = new LinkedBinaryTree<Situation>(e5);
     
    n6 = new LinkedBinaryTree<Situation>(e6);
    
    n7 = new LinkedBinaryTree<Situation>(e7);
    //n2 and n3 have to be placed here because n4 has to be initalized before n2 and n3 pass it as a parameter
    n2 = new LinkedBinaryTree<Situation>(e2, n4, n5);
     
     n3 = new LinkedBinaryTree<Situation>(e3, n6, n7);
    
     mainTree = new LinkedBinaryTree<Situation>(e1, n2, n3);

  }
  
public void traverse() 
  {
    LinkedBinaryTree<Situation> current = mainTree; 
    
    while (current.size() != 1) // while not a leaf
      
    {
      System.out.println(current.getRootElement()); 
      Scanner sc = new Scanner(System.in); // get user answer
      String str = sc.next();
//      System.out.println("["+str+"]"); toLowerCase())
      
      if (str.equalsIgnoreCase("no")) current = current.getLeft(); // change all text to lowercase
      if (str.equalsIgnoreCase("yes")) current = current.getRight();
    }
    System.out.println(current.getRootElement()); 
  }
  
  public static void main(String[] args){
    SituationTree test = new SituationTree();
   // System.out.println(test);
    test.traverse();
     
    
  }
}
