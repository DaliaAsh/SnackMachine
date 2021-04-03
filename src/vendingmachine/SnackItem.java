/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author HP
 */
public class SnackItem {
    public String name ; 
    public int price ; 
    public int quantity; 
    
    public SnackItem(String name , int price ,int quantity){
        this.name = name ; 
        this.price = price ; 
        if(quantity >= 1){
        this.quantity = quantity ; 
        }else{
        this.quantity = quantity = 1 ; 
        }
        
    }

    
    
}
