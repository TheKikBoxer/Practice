/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author Liam
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       testCircle();
//       
//       testRectangle();
       
       testCylinder();
    }

    private static void testCircle() {
        double radius = Double.valueOf(JOptionPane.showInputDialog("What radius would you like?"));
        
        
        System.out.println(Circle.getArea(radius));
        System.out.println(Circle.getDiameter(radius));
        System.out.println(Circle.getCircumfrence(radius));
    }

    private static void testRectangle() {
        System.out.println("Rectangle Test\n--------------");
        double width = Double.valueOf(JOptionPane.showInputDialog("What Width would you like?"));
        double length = Double.valueOf(JOptionPane.showInputDialog("What length would you like?"));
        
//        System.out.println("Area = " + Rectangle.getArea(width, length));
//        System.out.println("Perimeter = " + Rectangle.getPerimeter(width, length));
        
        
        System.out.printf("    Width       = %.3\n", width);
        System.out.printf("    Length      = %.3\n", length);
        System.out.printf("    Area        = %.3\n", Rectangle.getArea(width, length));
        System.out.printf("    Perimeter   = %.3\n", Rectangle.getPerimeter(width, length));
        System.out.printf("    Is a square = %s\n", Rectangle.isSquare(width, length));
    }

    private static void testCylinder() {
        System.out.println(Cylinder.getVolume(4, 6));
        System.out.println(Cylinder.getVolume(5, 7));

    }
    
   
}
