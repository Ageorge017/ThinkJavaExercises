/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinkjavaexercises;

/**
 *
 * @author albertgeorge
 */
public class Chapter8 {
    public static void  BottlesOfBeer(int num){
        if(num == 0){
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't take one down, ya' can't pass it around, 'cause there are no bottles of beer on the wall\n");
        }
        else{
            System.out.println(num +" bottles of beer on the wall, "+num+" bottles of beer, ya' take one down, ya' pass it around, 'cause there are no bottles of beer on the wall\n");
            BottlesOfBeer(num-1);
        }
    }
}
