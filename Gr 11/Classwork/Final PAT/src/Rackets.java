
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 21nic
 */
public class Rackets extends Equipment {

    private int racketWeight;
    private String stringPattern;
    private int swingWeight;
    private int vibration;
    private int power;
    private Date racketModel;
    private int length;
//Parameterized constructor. Receives values for racketWeight, stringPatter, swingWeight, name, colour, price, availableStock, vibration, power, racketModel, and length fields in the parameter and sets the fields to the received value. 
    //This method is public because it needs to be accessed outside of this class.
    public Rackets(String name, int racketWeight, String colour, int price, String stringPattern, int swingWeight, int vibration, int power, Date racketModel, int length, int availableStock) {
        super(name, colour, price, availableStock);
        this.racketWeight = racketWeight;
        this.stringPattern = stringPattern;
        this.swingWeight = swingWeight;
        this.vibration = vibration;
        this.power = power;
        this.racketModel = racketModel;
        this.length = length;

    }

    public int getRacketWeight() {//Returns the value of racketWeight. 
        //This method is public because it needs to be accessed outside of this class.
        return racketWeight;
    }

    public String getStringPattern() {//Returns the value of stringPattern. 
        //This method is public because it needs to be accessed outside of this class.
        
        return stringPattern;
    }

    public int getSwingWeight() { //Returns the value of swingWeight. 
        //This method is public because it needs to be accessed outside of this class
        
        return swingWeight;
    }

    public int getVibration() {//Returns the value of vibration. 
        //This method is public because it needs to be accessed outside of this class
        return vibration;
    }

    public int getPower() {//Returns the value of power. 
        //This method is public because it needs to be accessed outside of this class
        return power;
    }

    public Date getRacketModel() {//Returns the value of racketModel. 
        //This method is public because it needs to be accessed outside of this class.
        return racketModel;
    }

    public int getLength() {//Returns the value of length.
        //This method is public because it needs to be accessed outside of this class
        return length;
    }

}
