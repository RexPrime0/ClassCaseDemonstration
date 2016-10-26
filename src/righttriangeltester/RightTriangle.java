/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package righttriangeltester;

/**
 *
 * @author Abels6598
 */
public class RightTriangle {
    /**
     * initialize instance variables
     */
    
    private double base;
    private double height;
    
    public RightTriangle(){
      //constructor sets default base and height to 3
       base = 1;
       height = 1;
   }
    /**
    * parameter bas sets the base of the right triangle
    * parameter height sets the height of the right triangle
    */
    public RightTriangle(double bas, double heigh){
       //constructor sets base and hieght based on user inputs
       base = bas;
       height = heigh;
   }
   
   /**
    * parameter bas: the base is changed to this parameter
    */
   public void setBase(double bas){
      //sets the base based on double inputted by user
      base = bas;
  }
  
  /**
    * parameter heigh: the height is changed to this parameter
    */
   public void setHeight(double heigh){
      //sets the hieght based on double inputted by user
      height = heigh;
  }
  /**
    * pre-condition: none
    * post-condition: base variable is returned 
    */
   public double getBase(){
      //returns base value
      return base;
  }
  /**
    * pre-condition: none
    * post-condition: the height variable is returned 
    */
   public double getHeight(){
      //returns height value
      return height;
  }
   /**
    * pre-condition: none
    * post-condition: the calculated area of the triangle is returned as a double
    */
   public double area(){
      //returns the area of the triangle
    double a = 0.5 * height * base;
    return a;
  }
  
  
  
}
