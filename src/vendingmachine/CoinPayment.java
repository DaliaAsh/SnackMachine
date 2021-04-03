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

public class CoinPayment extends Payment{
    public int enteredCoin ; 
    public int allowedCoins[]={10,20,50,100}; 
    public CoinPayment(int enteredCoin , SnackItem[] snacks){    
     this.enteredCoin = enteredCoin ;
     this.snacks = snacks; 
     for(int i = 0;i<snacks.length ; i++){
     this.totalPrice+= snacks[i].price; 
     }
    }
    
    public SnackItem[] processPayment(){
    boolean found = false ; 
    for(int i = 0 ; i < 4 ; i++){
    if (enteredCoin == allowedCoins[i]){
    found = true ; 
    break ; 
    }
    }
    if(!found){
    System.out.println("You entered unaccepted coin , try again please !");
     System.out.println("The accepted coins are : 10 , 20 , 50 & 100");
    return null ; 
    }
    if(totalPrice == enteredCoin){
     System.out.println("Thank you , you can now get your snack!");
     return  this.snacks ;
    }else if(totalPrice <= enteredCoin){
       System.out.println("You can take the rest of your coins from the machine :)");
     return  this.snacks ;
    }else{

      System.out.println("Please enter the needed coin :)");
     return null ; 
    }
    
    
    }
    
    
}