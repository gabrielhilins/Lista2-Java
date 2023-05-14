/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2q1;

/**
 *
 * @author Windows
 */
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2q1 {

    public static void main(String[] args) {
        Scanner numero;
        numero = new Scanner(System.in);
        int id;
        float mA, mE, n1, n2, n3;
        
        System.out.println("Digite aqui seu número de identificação:");
        id = numero.nextInt();
        
        System.out.println("Digite o valor da Primeira Nota:");
        n1 = numero.nextFloat();
        System.out.println("Digite o valor da Segundaa Nota:");
        n2 = numero.nextFloat();
        System.out.println("Digite o valor da Terceira Nota:");
        n3 = numero.nextFloat();
        
        mE = (n1 + n2 + n3)/3;
        mA = (n1 + 2*n2 + 3*n3 + mE)/7;
        System.out.print("Média dos exercícios:");
        System.out.printf("%.2f\n", mE);
      
        System.out.print("Média de aproveitamento:");  
        System.out.printf("%.2f\n", mA);
       
        
        if((mA <= 10.0 && mA >= 9.0)){
            System.out.println("Conceito A. Parabéns! Você está APROVADO!");
        }
        else if((mA >= 7.5 && mA <= 9.0)){
            System.out.println("Conceito B. Parabéns! Você está APROVADO!");  
        }
        else if((mA >= 6.0 && mA <= 7.5)){
            System.out.println("Conceito C. Parabéns! Você está APROVADO!");
        }
        else if((mA >= 4.0 && mA <= 6.0)){
            System.out.println("Conceito D. Cuidado! Você está de RECUPERAÇÃO!");
        }
        else{
            System.out.println("Conceito E. Casa caiu! Você está REPROVADO!");
        }
        }
}
