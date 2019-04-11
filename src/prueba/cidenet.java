/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Lnv
 */
public class cidenet {
    
    public static void main(String[] args) {
        int n=56;
        if(n%8<1){
            n=5;
        }else{
            n=4;
        }
        for (int i =n; i <=6; i++) {
            n=n*2;
        }
        System.out.println(n);
        System.out.println("");
        
        int i=1;
        Scanner e=new Scanner(System.in);
        System.out.println("digite el numero");
        int m=e.nextInt();
        
        while(i<m){
            i=i+1;
            
        }
        System.out.println(i);
        
    }
}
