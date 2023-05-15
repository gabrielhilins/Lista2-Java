/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2q5;

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class Lista2q5 {

    public static void main(String[] args) {
        Scanner numero;
        numero = new Scanner(System.in);
        int x, y;
        System.out.println("Digite o valor de X:");
        x = numero.nextInt();
        System.out.println("Digite o valor de Y:");
        y = numero.nextInt();
        
        if(x == y){
             System.out.println("NÚMEROS IGUAIS!");
        }
        else if(x > y){
             System.out.println("X É MAIOR!");
        }
        else {
             System.out.println("Y É MAIOR!");
        }
        
        
    }
}
