/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class User {
   public SnackMachine snackMachine ;
   public String username  ;
   public User(SnackMachine snackMachine , String username){
   this.snackMachine = snackMachine ;
   this.username = username ; 
   }
    public  void scanUserInput(){
        System.out.println("Welcome "+this.username+" to the Snacks Machine !");
        System.out.println("To exit from the machine type exit");
        snackMachine.displaySnacks();  
                  System.out.println("Here is the availble snacks , to show them press 1");
                  System.out.println("To pay a snack , press 2!");
                            Scanner userInput = new Scanner(System.in); 
    while(true){
        String eneteredText = userInput.nextLine(); 
        if(eneteredText.equals("exit")){
        break ; 
        }
        try{
        int enteredNumber = Integer.parseInt(eneteredText); 
       switch(enteredNumber){
           case 1 :    snackMachine.displaySnacks(); 
           break ; 
           
           case 2 : 
              Payment paymentMethod =   snackMachine.handlePayment(); 
               snackMachine.setPaymentMethod(paymentMethod);
               break ; 
               
      
        }    
        }catch(Exception expection){
        System.out.println("Please enter valid number!");
        }
        
    
    }
    
    } 
}
