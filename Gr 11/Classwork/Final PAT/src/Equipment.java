/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class Equipment {
    
    private String name;
    private String colour;
    private int price;
    private int availableStock; 
    
    //Parameterized constructor. Receives values for name, colour, price and availableStock fields in the parameter and sets the fields to the received values. 
    //This method is public because it needs to be accessed outside of this class.
    public Equipment(String name, String colour, int price, int availableStock) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.availableStock = availableStock;
    }

    public String getName() {//Returns value of name attribute. 
        //This method is public because it needs to be accessed outside of this class.
        return name;
    }

    public String getColour() {//Returns value of colour attribute. 
        //This method is public because it needs to be accessed outside of this class
        return colour;
    }

    public int getPrice() {//Returns value of price attribute. 
        //This method is public because it needs to be accessed outside of this class.
        return price;
    }

    public int getAvailableStock() {//Returns value of availableStock attribute. 
        //This method is public because it needs to be accessed outside of this class.
        return availableStock;
    }

   
    
    
}
