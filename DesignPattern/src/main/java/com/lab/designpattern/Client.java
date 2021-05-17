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
public class Client {
   public static void main(String[] args) {
   CyberTruckGold cyber1= CyberTruckGold.getInstance();
   CyberTruckGold cg = CyberTruckGold.getInstance();
   System.out.println((System.identityHashCode(cg)));
   cg.run();
   System.out.println((System.identityHashCode(cyber1)));
   cyber1.run();
   }
}
