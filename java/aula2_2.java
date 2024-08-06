package com.mycompany.aula2;

import java.util.Scanner;

public class aula2_2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int number = input.nextInt();
        input.close();
        if (number % 2 == 0) 
        {
            System.out.println("\n\n\n" + number + " é par");
        } 
        else
        {
            System.out.println("\n\n\n" + number + " é impar");
        }
    }
}
