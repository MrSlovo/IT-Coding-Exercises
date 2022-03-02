/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class Balls extends Equipment{
    private boolean highAlt;
    ////Parameterized constructor. Receives value for name, colour, price, availableStock, highAlt field in the parameter and sets the fields to the received value. 
    //This method is public because it needs to be accessed outside of this class.
    public Balls(String name, boolean highAlt, String colour, int price, int availableStock  ){
        super(name, colour, price, availableStock);
        this.highAlt = highAlt;
    }

    public boolean isHighAlt() {//Returns the value of highAlt. 
        //This method is public because it needs to be accessed outside of this class


        return highAlt;
    }
   
           
    
}
