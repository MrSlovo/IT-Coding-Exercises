/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class Bags extends Equipment{
    private int racketSpace; 
    //Parameterized constructor. Receives value for  name, colour, price, availableStock,racketSpace field in the parameter and sets the field to the received value. 
    //This method is public because it needs to be accessed outside of this class.
    public Bags(String name, String colour, int racketSpace, int price, int availableStock){
        super(name, colour, price, availableStock);
        this.racketSpace = racketSpace;
        
        
    }

    public int getRacketSpace() {//Returns the value of racketSpace. 
        //This method is public because it needs to be accessed outside of this class.
        return racketSpace;
    }
    
}
