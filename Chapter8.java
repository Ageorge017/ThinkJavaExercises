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
    
    public static int oddSum(int num, int sum){
        if(num==1)
            return sum+num;
        else{
            if(num%2==0)
                return oddSum(num-1,sum);
            else
                return oddSum(num-1, sum+num);
        }
    }
    
    public static int Ack(int m, int n){
        if (m==0)
            return n+1;
        if (m>0){
            if(n==0)
                return Ack(m-1,1);
            if(n>0)
                return Ack(m-1,Ack(m,n-1));
        }
        
        return -1;
    }
}
