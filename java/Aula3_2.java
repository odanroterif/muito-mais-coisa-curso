package com.mycompany.aula3_2;

import java.util.Scanner;

public class Aula3_2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);        
        int c = 1;
        int[] numbers = new int[c];
        
        System.out.print("Digite numeros positivos: ");
        int number = input.nextInt();
        numbers[c-1] = number;

        while (number >= 0) 
        {                     
            System.out.print("continue digitando: ");
            number = input.nextInt();
            c++;
            numbers[c-1] = number;                           
        }
        System.out.println("PARES\n");
        for (int i = 0; i < c; i++) 
        {
            if (numbers[i] % 2 == 0) 
            {
               System.out.println(numbers[i]);               
            }            
        }
         System.out.println("IMPARES\n");
        for (int i = 0; i < c; i++) 
        {
            if (numbers[i] % 2 != 0) 
            {
               System.out.println(numbers[i]);               
            }            
        }      
    }
}
