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
public class CardPayment extends Payment{
    public String cardId; 
    public int cardValue ; 
    public CardPayment(String cardId,int cardValue,SnackItem[] snacks){
    this.cardId = cardId ; 
    this.cardValue = cardValue ; 
    this.snacks = snacks; 
     for(int i = 0;i<snacks.length ; i++){
     this.totalPrice+= snacks[i].price; 
     }
    }
    public SnackItem[] processPayment(){
        if(cardValue >=totalPrice){
        this.cardValue = this.cardValue - this.totalPrice;     
        System.out.println("Thank you , you can get your snack now !");
           return this.snacks ; 
        }else{
         System.out.println("Check your card value please :)");
            return null ; 
        }
   
    }
    
    
}