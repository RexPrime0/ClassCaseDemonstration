/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package righttriangeltester;

import javax.swing.JOptionPane;

/**
 *
 * @author Abels6598
 */
public class RightTrianglelTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        //ask user for starting values
        String length = JOptionPane.showInputDialog(
        "Input the the base of your right triangle in cm");
        String startS = JOptionPane.showInputDialog("input the height of your right triangle in cm");
        double startHeight = Double.parseDouble(startS);
        double startBase = Double.parseDouble(length);
        
        RightTriangle Tri = new RightTriangle(startBase, startHeight);
        
       int i = 4;
        while(i == 4){
             //repeats until the user selects shutdown option
             String choice = JOptionPane.showInputDialog(
              "Triangle Program interface:\n"
            + "1 - Change Base\n"
            + "2 - Change Height\n"
            + "3 - View current Base value\n"
            + "4 - View current Height value\n"
            + "5 - Calculate and view area of Right Triangle\n"
            + "6 - Shutdown the program");
             
             if(choice.equals("1")){
                 //asks user for new base value, inputs it to setBase method
                 String baseS = JOptionPane.showInputDialog("Input the new length of the base");
                 double base = Double.parseDouble(baseS);
                 Tri.setBase(base);
             }
             else if(choice.equals("2")){
                 //asks user for new Height value, inputs it to setHeight method
                 String heightS = JOptionPane.showInputDialog("Input the new height of the right triangle");
                 double height = Double.parseDouble(heightS);
                 Tri.setHeight(height);
             }
             else if(choice.equals("3")){
                //get base length from from object, display it in a message dialog
                 double base = Tri.getBase();
                 JOptionPane.showMessageDialog(null, "The base is " + base + "cms long");
             }
             else if(choice.equals("4")){
                //get height from from object, display it in a message dialog
                double height = Tri.getHeight();
                JOptionPane.showMessageDialog(null, "The height is " + height + "cms long");
             }
             else if(choice.equals("5")){
                //get area from from object, display it in a message dialog
                 double area = Tri.area();
                 JOptionPane.showMessageDialog(null, "The area of the right triangle is " + area + "cms");
             }
             else if(choice.equals("6")){
                 //close the program
                 System.exit(0);
             }
                
    }
    }
    
}
