package com.mycompany.aula2;

import java.util.Scanner;

public class Aula2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String[] name = new String[3];
     
        for (int c = 0; c < 3; c++)
        {
            System.out.println("digite o nome "+c+": ");
            name[c] = input.nextLine();
        }
        input.close();      
        for(int c = 0; c < 3; c++)
        {
            System.out.println(name[c]);   
        }
    }
}
