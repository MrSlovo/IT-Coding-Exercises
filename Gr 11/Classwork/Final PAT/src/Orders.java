/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class Orders {
 
    private String userOrder; 
    private int orderPrice; 

    public Orders( String userOrder, int orderPrice) {//Parameterized constructor. Receives value for userOrder,  and orderPrice field in the parameter and sets the fields to the received value. 
        //This method is public because it needs to be accessed outside of this class.
        
        this.userOrder = userOrder;
        this.orderPrice = orderPrice;
    }

    public String getUserOrder() {//Returns the value of userOrder. 
        //This method is public because it needs to be accessed outside of this class


        return userOrder;
    }

    public int getOrderPrice() { //Returns the value of orderPrice. 
        //This method is public because it needs to be accessed outside of this class
        return orderPrice;
    }
}
