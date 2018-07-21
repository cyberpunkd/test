/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cyberpunkd
 */

import java.util.Scanner;

public class Kolmiolaskin {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Anna kolmion leveys:");
        double base = scanner.nextDouble();
        
        System.out.println("Anna kolmion pituus:");
        double height = scanner.nextDouble();
        
        //Pinta-ala on leveys * korkeus / 2:lla. 
        
        double area = (base*height)/2;
        
        System.out.println("Kolmion pinta-ala on: " + area);
        
        
        
    }
}
