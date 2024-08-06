package com.mycompany.aula2;

import java.util.Scanner;

public class aula2_1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("digite um numero: ");
        number = input.nextInt();
        input.close();
        if (number >= 0) 
        {
            System.out.println("\n\n\npositivo");
        } 
        else 
        {
            System.out.println("\n\n\nnegativo");
        }
    }
}
