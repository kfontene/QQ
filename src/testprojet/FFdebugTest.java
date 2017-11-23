/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojet;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class FFdebugTest {

    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    private String myString;

    public static void main(String[] args) {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : "
                + FFdebugCalc.trouvermax(debug.myArray));
        System.out.println("La valeur la plus petite est : "
                + FFdebugCalc.findMin(debug.myArray));
                        
    }
    /**
     * 
     * @param myInt 
     */
    public FFdebugTest(int myInt) {
        this.myInt = myInt;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public FFdebugTest(int[] myArray) {
        this.myArray = myArray;
    }
    /**
     * 
     * @param array 
     */
    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
    
    
}