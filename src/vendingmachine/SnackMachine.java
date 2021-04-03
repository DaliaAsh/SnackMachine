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
import java.util.ArrayList;
import java.util.Scanner;

public class SnackMachine {
    private ArrayList<SnackItem> snacks ;
    private int[] keypadInputs ={0,1,2,3,4,5,6,7,8,9};
    private Payment paymentMethod ; 
    
    public SnackMachine(){
    this.snacks = new ArrayList();
    }
    
    
 public   void addSnack(SnackItem snack){
        snacks.add(snack);
    }
  public   ArrayList<SnackItem> getSnacks(){
        return this.snacks; 
    }
    
    
  public  void displaySnacks(){
        for(int i = 0 ; i < this.snacks.size(); i++){
        System.out.println(this.snacks.get(i).name + " , " + this.snacks.get(i).price +
                "$ , " + this.snacks.get(i).quantity  + " item , " + "The id is : " + i
                );
        }
    }
 public   Payment handlePayment(){
     SnackItem orderedItems[] ;   
        try{
    System.out.println("Write the id's of your snacks sepeated by spaces please :)");
    Scanner chosenSnacks = new Scanner(System.in); 
    String snacksIds   = chosenSnacks.nextLine(); 
    String ids[] = snacksIds.split(" "); 
    orderedItems = new SnackItem[ids.length]; 
    if(ids.length > 0){
    for(int i = 0 ; i < ids.length ; i++){
    int index = Integer.parseInt(ids[i]); 
    orderedItems[i] = this.snacks.get(index); 
    }
    
    }
        }catch(Exception exception){
        System.out.println("please enter valid id !"); 
        return  null ; 
        }
        
    System.out.println("Choose one of the payment method by entering it's number :");
    System.out.println("1 - Card Payment");
    System.out.println("2 - Coin Payment");
    System.out.println("3 - Note Payment");
    try{
         Scanner userInput = new Scanner(System.in); 
         String enteredText = userInput.nextLine(); 
         int enteredNumber = Integer.parseInt(enteredText); 
         switch(enteredNumber){
             case 1:
                 System.out.println("Enter your Card id :");
                 Scanner idInput = new Scanner(System.in); 
                 String cardId = idInput.nextLine(); 
                 System.out.println("Enter your Card value :");
                 Scanner cardInput = new Scanner(System.in); 
                 int cardValue = cardInput.nextInt();
                 return new CardPayment(cardId,cardValue,orderedItems); 
               
             case 2 :
                     System.out.println("Enter your Coins :");
                   
                 Scanner coinsInput = new Scanner(System.in); 
                
                 
                 int coinsValue = coinsInput.nextInt();
                 return new CoinPayment(coinsValue,orderedItems);  
   
             
                 
             case 3 :
                     System.out.println("Enter your Notes :");
                 Scanner notesInput = new Scanner(System.in); 
                
                 
                 int notesValue = notesInput.nextInt();
                 return new NotePayment(notesValue,orderedItems);  
                 
        
         
         }
    
    }catch(Exception exception){
      System.out.println(exception);
    return null; 
    }
    return null ; 
    }
    

    
 
    
  public  void setSnacks(ArrayList<SnackItem> snacks){
    this.snacks = snacks ;
    }
    

    void deliverSnack(SnackItem[] orderedSnacks){
    for (int i = 0 ; i < orderedSnacks.length ; i++){
    if(this.snacks.contains(orderedSnacks[i])){
       
        if(orderedSnacks[i].quantity == 1){
        int snackIndex = this.snacks.indexOf(orderedSnacks[i]); 
        this.snacks.remove(snackIndex); 
        continue ; 
        }
    SnackItem updatedSnack = new SnackItem(orderedSnacks[i].name ,orderedSnacks[i].price ,
    orderedSnacks[i].quantity-1
    ) ; 
    snacks.set( snacks.indexOf(orderedSnacks[i]) , updatedSnack);
    this.snacks = snacks ; 
    }
    }
  System.out.println("The snack is delivered !");
  System.out.println("The updated list of snacks:\n");
  displaySnacks();
    }
    
  public  void setPaymentMethod(Payment paymentMethod ){
    this.paymentMethod = paymentMethod ; 
    SnackItem processedSnacks[] = this.paymentMethod.processPayment();
    if(processedSnacks != null){
    deliverSnack(processedSnacks); 
    }
    }
    
    
}
