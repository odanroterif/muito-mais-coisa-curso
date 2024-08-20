package com.mycompany.aula3_4;

import java.util.Scanner;

public class Aula3_4
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
                
        System.out.print("Digite: ");
        int number = input.nextInt();
        
        for (int c = 0; c <= number; c++) 
        {
            if (c%2 != 0) 
            {
                System.out.println(c);
            }            
        }
    }
}