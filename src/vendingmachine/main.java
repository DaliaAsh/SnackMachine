/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class main {

    static SnackMachine initalizeSnackMachineWithSnacks(){
    SnackMachine snackMachine = new SnackMachine(); 
    SnackItem juice = new SnackItem("juice",20 ,  2); 
    SnackItem candy = new SnackItem("candy",40 ,  8); 
    SnackItem crisp = new SnackItem("crisp",26 , 1); 
    SnackItem biscuit = new SnackItem("biscuit",90 , 4); 
    SnackItem fruit = new SnackItem("fruit",70 , 5); 
    ArrayList snacks= new ArrayList<SnackItem> (); 
    snacks.addAll(Arrays.asList(juice,candy,crisp,biscuit,fruit));
    snackMachine.setSnacks(snacks);
    return snackMachine ; 
    }
   
    public static void main(String[] args) {
    SnackMachine snackMachine =  initalizeSnackMachineWithSnacks(); 
    User user = new User(snackMachine,"dalia"); 
    user.scanUserInput() ; 
        
        
    }
    
}
