/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shecodeafrica;

import javax.swing.JOptionPane;

/**
 *
 * @author Bomkazi
 */
public class SheCodeAfrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        String surname = JOptionPane.showInputDialog("Please enter your surname");
        System.out.print("HI "+name+" "+ surname);
        System.out.println(" YOU ROCK!");
        
       
    }
    
}
