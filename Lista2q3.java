/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2q3;

/**
 *
 * @author Windows
 */
import java.util.Scanner;


public class Lista2q3 {

    public static void main(String[] args) {
        float n1, n2, soma, sub, mult, div, resto, elevado, raiz;
        int opcao;
        Scanner numero;
        numero = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número:");
        n1 = numero.nextFloat();
        System.out.println("Digite o valor do segundoo número:");
        n2 = numero.nextFloat();
        
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1*n2;
        div = n1/n2;
        resto = n1 % n2;
        elevado = (float) Math.pow(n1, n2);
        raiz = (float) Math.sqrt(n1);
        
     
       System.out.println("1) Adição");
       System.out.println("2) Subtração");
       System.out.println("3) Multiplicação");
       System.out.println("4) Divisão");
       System.out.println("5) Resto da divisão");
       System.out.println("6) Potência");
       System.out.println("7) Raiz quadrada");
       System.out.println("Qual das operações à seguir você deseja fazer?:");
       opcao = numero.nextInt();
       
       switch(opcao){
           case 1:
               System.out.println("Resultado:" + soma);
               break;
           case 2:
                System.out.println("Resultado:" + sub);
                break;
           case 3:
                System.out.println("Resultado:" + mult);
                break;
           case 4:
                System.out.println("Resultado:" + div);
                break;
           case 5:
                System.out.println("Resultado:" + resto);
                break;
           case 6:
                System.out.println("Resultado:" + elevado);
                break;
           case 7:
                System.out.println("Resultado:" + raiz);
                break;
           default:
       }
       
       
       
       
       
       
    
       
    }   
    }

   
