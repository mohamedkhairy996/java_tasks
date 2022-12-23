/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet6_task3;

import java.util.Scanner;

/**
 *
 * @author mohamed khairy
 */
public class Sheet6_task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello !");
        //Cylinder c1 = new Cylinder(4.0, 1.0, "blue");
        //System.out.println("Clinder height = "+c1.getHeight()+"\nand radius = "+c1.getRadius()+"\ncolor is "+c1.getColor()+"\narea of circle of bases = "+c1.get_area()+"\nvolume = "+c1.getVolume());
        Cylinder cylinder = new Cylinder();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = in.nextDouble();
        System.out.print("Enter the height : ");
        double h = in.nextDouble();
        System.out.print("Enter the color : ");
        String c = in.next();
        cylinder.setColor(c);
        cylinder.setHeight(h);
        cylinder.setRadius(r);
        System.out.println("Clinder height = "+cylinder.getHeight()+"\nand radius = "+cylinder.getRadius()+"\ncolor is "+cylinder.getColor()+"\narea of circle of bases = "+cylinder.get_area()+"\nvolume = "+cylinder.getVolume());
 
    }
}



 
