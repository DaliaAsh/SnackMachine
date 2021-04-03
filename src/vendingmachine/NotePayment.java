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
public 
class NotePayment extends Payment{
    public int enteredNote ; 
     public NotePayment(int enteredNote , SnackItem[] snacks){  
     this.enteredNote = enteredNote ;
     this.snacks = snacks; 
     for(int i = 0;i<snacks.length ; i++){
     this.totalPrice+= snacks[i].price; 
     }
    }
    
      public SnackItem[] processPayment(){
    if(enteredNote != 20 && enteredNote != 50){
    System.out.println("Not accepted , only enter 20$ or 50$");
       return null ; 
    }
       if(enteredNote ==totalPrice){
        System.out.println("Thank you , you can get your snack now !");
           return this.snacks ; 
        }else if(enteredNote <totalPrice){
          System.out.println("Please enter the needed money :)");
             return null ; 
        }
       else{
          System.out.println("You can take the rest of your coins from the machine :)");
            return this.snacks ; 
        }
    }
    
    
}
