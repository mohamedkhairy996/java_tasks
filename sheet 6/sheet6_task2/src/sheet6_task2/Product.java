/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sheet6_task2;

/**
 *
 * @author mohamed khairy
 */
public interface Product {
    public double getPrice() ;
}

class book implements  Product{

    double price = 0;
    String name = "Book" ;
    String color = "black";

    public void setPrice(double price) {
        this.price = price;
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
        return "book name = " + name +" , color = "+color +" ,price before = "+this.price+" and price after = "+getPrice()+" }";
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
          return "children_book name = " + name +" , type = " + type + " , color = "+color+" ,price before = "+super.price+" and price after "+getPrice()+" }";
    }
    
}
class cartoon extends  book{

   private String type = "Cartoon book";


    public cartoon(String n, double pr,String co,String type) {
        super(n, pr,co);
        this.type=type;
    }
     public cartoon(String n, double pr,String co ) {
        super(n, pr,co);
        
    }

    public cartoon() {
        
    }
    

    @Override
    public  double getPrice( ){
        return this.price *.90;
    }

    @Override
    public String toString() {
     
        return "Cartoon book name = " + name +" , type = " + type + " , color = "+color+" ,price before = "+super.price+" and price after = "+getPrice()+" }";
    }
    
}
