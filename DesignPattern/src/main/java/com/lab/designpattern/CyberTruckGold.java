/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.designpattern;

/**
 *
 * @author Marut
 */
public class CyberTruckGold {
    //single instance 
    private static CyberTruckGold onlyInstance;
    
    //make constructor private 
    private CyberTruckGold(){
    
    }
    public void run(){
    System.out.println("Cybertruck is running ..");
    }
    // static method for creating object 
    public static CyberTruckGold getInstance(){
    //create only one instance of object 
    if(onlyInstance ==null){
        onlyInstance = new CyberTruckGold();
    }
    return onlyInstance;
    }
}
