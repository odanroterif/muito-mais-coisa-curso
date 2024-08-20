package com.mycompany.aula3_3;

import java.util.Scanner;

public class Aula3_3 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;

        do 
        {
            System.out.print("Digite um numero: ");
            number = input.nextInt();

        } while (!(number > 1 && number < 5));
    }
}        
