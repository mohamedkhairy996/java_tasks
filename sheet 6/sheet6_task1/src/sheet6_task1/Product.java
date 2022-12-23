package sheet6_task1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohamed khairy
 */
public abstract class Product {
    
    double price ;
    public abstract double getPrice() ;
    public void setPrice(double price) {
        this.price=price;
    }
}

class book extends  Product{

    String name = "Book" ;
    String color = "black";

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public book(String n , double pr , String co)
    {
        this.price=pr;
        this.name=n;
        this.color=co;
    }

    public book() {
    
    }
    
    
    @Override
    public  double getPrice(){
        return price*0.5;
    }

    @Override
    public String toString() {
        return "book name = " + name +" , color = "+color +" and price = "+getPrice()+" }";
    }

  
}
class children_book extends  book{

   private String type = "children story";


    public children_book(String n, double pr,String co,String type) {
        super(n, pr,co);
        this.type=type;
    }

    public children_book() {
        
    }
    

    @Override
    public  double getPrice( ){
        return this.price * .3;
    }

    @Override
    public String toString() {
        return "children_book name = " + name +" , type = " + type + " , color = "+color+" and price = "+getPrice()+" }";
    }
    
}
