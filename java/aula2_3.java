package com.mycompany.aula2;

import java.util.Scanner;

public class aula2_3 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[2];

        for (int c = 0; c < 2; c++) 
        {
            System.out.print("digite um numero: ");
            number[c] = input.nextInt();
        }

        input.close();
        
        if (number[0] % number[1] % 2 == 0 || number[1] % number[0] % 2 == 0) 
        {
            System.out.println("\n\n\n" + number[0] + " e " + number[1] + " sao multiplos");
        } 
        else 
        {
            System.out.println("\n\n\n" + number[0] + " e " + number[1] + " nao sao multiplos");
        }
    }
}
