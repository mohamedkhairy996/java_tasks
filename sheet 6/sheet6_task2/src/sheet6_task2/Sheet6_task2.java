/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet6_task2;

/**
 *
 * @author mohamed khairy
 */
public class Sheet6_task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello.......");
        Product p[] = new Product[3] ;
        p[0]=new book("java",1000.0,"green");
        p[1]=new children_book("ABC",200,"red","Learning");
        p[2]=new cartoon("The lion king",100,"blue");
        
        System.out.println(p[0].toString());
       // System.out.println(p[0].getPrice());
        System.out.println(p[1].toString());
        //System.out.println(p[1].getPrice());
        System.out.println(p[2].toString());
        //System.out.println(p[2].getPrice());
    }
    
}
