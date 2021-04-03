/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vendingmachine.SnackItem;
import vendingmachine.SnackMachine;
import vendingmachine.User;
import vendingmachine.CoinPayment;
import vendingmachine.NotePayment;

/**
 *
 * @author HP
 */
public class SnackMachineTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;  
    public SnackMachineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
     
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    SnackMachine initializeSnackMachine(){
       SnackMachine snackMachine = new SnackMachine();
          SnackItem juice = new SnackItem("juice",15 ,  1); 
          snackMachine.addSnack(juice);
          return snackMachine; 
    }
     @Test
     public void AddSnacksTest() {
         SnackMachine snackMachine = initializeSnackMachine();
          assertEquals(snackMachine.getSnacks().size(),1);    
     }
     
    
     
}
