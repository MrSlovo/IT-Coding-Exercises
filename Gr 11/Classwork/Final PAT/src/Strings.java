/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class Strings extends Equipment {
    private String stringComposition;
    private double stringGuage;
    //Parameterized constructor. Receives values for stringComposition, stringGuage, name, colour, price, availableStock fields in the parameter and sets the fields to the received value. 
    //This method is public because it needs to be accessed outside of this class.
    public Strings(String name, String stringComposition, String colour, double stringGuage, int price, int availableStock){
        super(name, colour, price, availableStock);
        this.stringComposition = stringComposition;
        this.stringGuage = stringGuage;
 
    }

  

    public String getStringComposition() {//Returns the value of stringComposition. 
        //This method is public because it needs to be accessed outside of this class
        return stringComposition;
    }

  
    public double getStringGuage() {//Returns the value of stringGuage. 
        //This method is public because it needs to be accessed outside of this class
        return stringGuage;
    }

  

  
 
}
