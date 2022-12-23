/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet6_task3;
/**
 *
 * @author mohamed khairy
 */
public abstract class Circle {
    
    private double radius = 1.0 ; 
    private String color = "red";
    public void Circle(){};
    public void Circle(double radius)
    {this.radius=radius;};
    public void Circle(double radius , String color)
    {
    this.radius=radius; 
    this.color=color;
    }
    public abstract double get_area();

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
     
}
class Cylinder extends Circle {

    double height = 1.0;

    public Cylinder() {};
    public Cylinder(double height) {
        this.height=height;
    }
    public Cylinder(double height,double radius) {
        super.setRadius(radius);
        this.height=height;
        
    }
        public Cylinder(double height,double radius,String color) {
        super.setRadius(radius);
        super.setColor(color);
        this.height=height;
        
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    public double getVolume(){
      
        return 3.14*height*getRadius();
        
    }

    @Override
    public double get_area() {
       return 2*3.14*getRadius(); 
    }
    
}
    

