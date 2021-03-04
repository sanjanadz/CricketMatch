/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket;

import java.util.Scanner;
import java.util.Random;
public class Cricket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       String name1,name2 ="";
       int wicket = 0;
       int random=0, ball = 0, score =0, over =0;
       
       Scanner s = new Scanner(System.in); 
       
        System.out.println("Enter Team 01 Name: ");
        name1 = s.nextLine();
        System.out.println("Enter Team 02 Name: ");
        name2 = s.nextLine();
       
        System.out.println("Team 1: "+name1);
        System.out.println("Team 2: "+name2);
        
        if (wicket < 5){
            if( ball < 15){
                System.out.println("Enter key p for batting");
                String key = s.nextLine();
                String in = "p";
                
               if(in.equals(key)){
                   int[] arr = {0,1,2,3,4,6,9};
                   Random r = new Random();
                   int randomNumber=r.nextInt(arr.length);
      	           System.out.println(arr[randomNumber]);
                   
                           
               }
               else{
                   System.out.println("Invalid input. Enter p again");
               }       
            }
        }
       
    }
}
