package com.mycompany.aula3_7;

import java.util.Scanner;

public class Aula3_7
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
                
        System.out.print("Digite: ");
        int number = input.nextInt();
        
        for (int c = 0; c <= number; c++) 
        {
            System.out.println(number + " x " + c + " = " + (number*c));         
        }
    }
}
