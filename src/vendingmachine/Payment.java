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
public abstract class Payment {
  public SnackItem[] snacks ; 
  public int totalPrice = 0 ; 
  public abstract SnackItem[] processPayment(); 
  }
     

