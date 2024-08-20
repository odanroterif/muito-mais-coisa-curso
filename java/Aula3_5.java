package com.mycompany.aula3_5;

import java.util.Scanner;

public class Aula3_5
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = {0,0};
                
        System.out.print("Digite: ");
        int number = input.nextInt();
        
        for (int c = 0; c <= number; c++) 
        {
            if (c >=10 && c <=20) 
            {
                numbers[0]++;
            }       
            else
            {
             numbers[1]++;
            }
        }
        System.out.println("in: " + numbers[0]);
        System.out.println("out: " + numbers[1]);
    }
}
