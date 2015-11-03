/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Liam
 */
public class Circle {
    public static double getArea(double radius) {
        return 3.14 * radius * radius;
        
    }
    public static double getDiameter(double radius) {
       return radius * 2.0; 
    }
    public static double getCircumfrence(double diameter) {
        return diameter * 3.14;
    }
    
}

