/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author DeadTrigger
 */
public class OrderPiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedQueue LQ1= new LinkedQueue();
            Scanner scan = new Scanner(System.in);
            
           int a = scan.nextInt();
                LQ1.add(a);
		LQ1.add(123);
		LQ1.add(23);
		LQ1.add(56);
		LQ1.add("Hello!");
               
		System.out.println(LQ1.toString());
                System.out.println("Order Completed"+ LQ1.remove());
                System.out.println(LQ1.toString());

		LinkedQueue LQ2= new LinkedQueue();
		LQ2.add(64);
		LQ2.add(99);
		System.out.println(LQ1);
		System.out.println(LQ1.toString());
		System.out.println(LQ1.equals(LQ2));
		System.out.println(LQ1.clone().toString());
		System.out.println(LQ1.removeBottomElement());
    }
    
}
