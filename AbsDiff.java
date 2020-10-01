/*
 * Program to display the absolute difference between two numbers
 * Author: Cody Stone
 * Date: 1/26/2020
 */
package mini02;

import java.util.Scanner;

public class AbsDiff {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;
        int dif1 = 0;
        int dif2 = 0;
        
        System.out.print("n1 n2?");
        n1 = input.nextInt();
        n2 = input.nextInt();
        
        if(n1 > n2){
            
            dif1 = n1 - n2;
            System.out.printf("%d is larger", n1);
            System.out.printf("|n1 - n2| = %d%n", dif1);
            
        }
        if(n2 > n1){
            dif2 = n2 - n1;
            System.out.printf("%d is larger%n", n2);
            System.out.printf("|n1 - n2| = %d%n", dif2);
            
        }
        if (n1 == n2){
            System.out.print("|n1 - n2| = 0%n");
        }
    }
            
}
