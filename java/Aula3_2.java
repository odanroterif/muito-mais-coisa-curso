package com.mycompany.aula3_2;

import java.util.Scanner;

public class Aula3_2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);        
        int c = 0;
        int[] numbers = new int[c+1];
        
        System.out.print("Digite numeros positivos: ");
        numbers[c] = input.nextInt();

        while (numbers[c] >= 0) 
        {            
            System.out.print("continue digitando: ");
            numbers[c+1] = input.nextInt();
            c++;
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
